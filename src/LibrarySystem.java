import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class LibrarySystem {
    private ArrayList<Library> libraries;
    private ArrayList<Category> categories;
    private ArrayList<Category> nullCategory;
    private ArrayList<Category> allCategories;
    private ArrayList<Person> people;
    private ArrayList<Resource> resources;
    ;
    public LibrarySystem(){
        this.libraries = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.nullCategory = new ArrayList<>();
        this.allCategories = new ArrayList<>();
        this.people = new ArrayList<>();
        this.resources = new ArrayList<>();
        Admin admin = new Admin("admin", "AdminPass");
        people.add(admin);
    }


    public void add_library(String adminName, String password, String libraryId, String name, String establishedYear, int table, String address){
        Library library = new Library(libraryId,name,establishedYear,table,address);

        String str = check_admin(adminName,password);

        if(str.equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                System.out.println("duplicate-id");
                return;
            }
        }
        System.out.println("success");
        libraries.add(library);

    }

    public void add_category(String adminName, String password, String categoryId, String name,String superCategoryId){
        Category category = new Category(categoryId, name, superCategoryId);

        String str = check_admin(adminName,password);
        if(str.equals("")){
            return;
        }
        int flag = 0,temp1 = 0 , temp2 = 0;

        for(Category i : categories){
            if(! i.getCategoryId().equals("null") &&  i.getCategoryId().equals(superCategoryId)){
                System.out.println("not-found 1");
                return;
            }
        }

        for(Category i : allCategories) {
            if (i.getCategoryId().equals(categoryId)) {
                temp1 = 1;
                break;
            }
        }

        if(temp1 == 1){
            System.out.println("duplicate-id");
            return;
        }
        int flag1 = 0 ;

        if(superCategoryId.equals("null")){
            System.out.println("success");
            nullCategory.add(category);
            allCategories.add(category);

        }
        /**
         * if(!superCategoryId.equals("null"))
         */
        else {
            for (Category i : allCategories) {
                if (i.getCategoryId().equals(superCategoryId)) {
                    flag1 = 1;
                    break;
                }
            }

            if(flag1 == 0){
                System.out.println("not-found");
                return;
            }
            System.out.println("success");
            categories.add(category);
            allCategories.add(category);
        }
    }

    public void add_student(String adminName, String password, String studentId, String studentPassword,String firstName, String lastName, String nationalId, String birthDate, String address){
        Student student = new Student(studentId,studentPassword,firstName,lastName,nationalId,birthDate,address);

        String str = check_admin(adminName,password);

        if(str.equals("")){
            return;
        }
        for(Person i : people){
            // if(i instanceof Student) {
            if (i.getId().equals(studentId)) {
                System.out.println("duplicate-id");
                return;
            }
            // }
        }
        System.out.println("success");
        people.add(student);

    }

    public void add_staff(String adminName, String password, String staffId, String staffPassword,String firstName, String lastName, String nationalId, String birthDate, String address, String kind){
        if(kind.equals("staff")) {
            Staff staff = new Staff(staffId, staffPassword, firstName, lastName, nationalId, birthDate, address);

            String str = check_admin(adminName,password);

            if(str.equals("")){
                return;
            }

            for(Person i : people){
                if(i.getId().equals(staffId)){  //&& i instanceof Staff){
                    System.out.println("duplicate-id");
                    return;
                }
            }
            System.out.println("success");
            people.add(staff);

        }
        else {
            Professor professor = new Professor(staffId, staffPassword, firstName, lastName, nationalId, birthDate, address);

            String str = check_admin(adminName,password);
            if(str.equals("")){
                return;
            }

            for (Person i : people) {
                if (i.getId().equals(staffId)){
                    System.out.println("duplicate-id");
                    return;
                }
            }
            System.out.println("success");
            people.add(professor);

        }
    }

    public void add_manager(String adminName, String password, String managerId, String managerPassword,String firstName, String lastName, String nationalId, String birthDate, String address,String libraryId) {
        Manager manager = new Manager(managerId, managerPassword, firstName, lastName, nationalId, birthDate, address, libraryId);

        int flag = 0;
        String str = check_admin(adminName,password);

        if(str.equals("")){
            return;
        }

        for (Person i : people) {
            if (i.getId().equals(managerId)){
                System.out.println("duplicate-id");
                return;
            }
        }
        for (Library i : libraries) {
            if (i.getLibraryId().equals(libraryId)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("not-found");
            return;
        }

        System.out.println("success");
        people.add(manager);

        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                i.setManagerOfLibrary(managerId,i);
                break;
            }
        }
    }

    public void remove_user(String adminName, String password, String id){

        if(check_admin(adminName, password).equals("")){
            return;
        }
        int flag = 0;
        for(Person i : people){
            if(i.getId().equals(id)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("not-found");
            return;
        }

        /**
         *  در صورتی که کاربر کتاب و یا پایاننامهای را در قرض داشته باشد و یا مبلغی
         * بدهکار باشد امکان حذف آن وجود ندارد و خروجی در این حالت allowed-not خواهد بود
         */

        System.out.println("success");
        Iterator<Person> it = people.iterator();
        while (it.hasNext()){
            Person p = it.next();
            if(p.getId().equals(id)){
                it.remove();
                return;
            }

        }

    }

    public void add_book(String managerId, String password,String bookId, String title, String author, String publishers, String printYear, String amountOfCopy, String categoryId, String libraryId){
        Book book = new Book(bookId, title, author, publishers, printYear, amountOfCopy, categoryId, libraryId);
        book.setNumberOfBooks(Integer.parseInt(amountOfCopy));

        if(check_manager(managerId, password).equals("")){
            return;
        }
        if(check_library_category(categoryId,libraryId).equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(i.getBooksLibrary().containsKey(bookId)){
                    System.out.println("duplicate-id");
                    return;
                }
            }
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(! i.equals(i.getManagerOfLibrary().get(managerId))){
                    System.out.println("permission-denied");
                    return;
                }
            }
        }
        System.out.println("success");
        resources.add(book);
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                i.setBooksLibrary(bookId,i);
                break;
            }
        }

    }

    public void add_thesis(String managerId, String password,String thesisId, String title, String studentName, String professorName, String defenseYear, String categoryId, String libraryId){
        Thesis thesis = new Thesis(thesisId, title, studentName, professorName, defenseYear, categoryId, libraryId);
        thesis.setNumberOfThesis(1);

        if(check_manager(managerId, password).equals("")){
            return;
        }
        if(check_library_category(categoryId,libraryId).equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(i.getThesesLibrary().containsKey(thesisId)){
                    System.out.println("duplicate-id");
                    return;
                }
            }
        }

        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(! i.equals(i.getManagerOfLibrary().get(managerId))){
                    System.out.println("permission-denied");
                    return;
                }
            }
        }
        System.out.println("success");
        resources.add(thesis);
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                i.setThesesLibrary(thesisId,i);
                break;
            }
        }

    }

    public void add_ganjineh(String managerId, String password,String ganjinehId, String title, String author, String publishers, String printYear, String donator, String categoryId, String libraryId) {
        Ganjineh ganjineh = new Ganjineh(ganjinehId, title, author, publishers, printYear, donator, categoryId, libraryId);
        if(check_manager(managerId, password).equals("")){
            return;
        }
        if(check_library_category(categoryId,libraryId).equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)) {
                if (i.getGanjinehLibrary().containsKey(ganjinehId)) {
                    System.out.println("duplicate-id");
                    return;
                }
            }
        }

        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(! i.equals(i.getManagerOfLibrary().get(managerId))){
                    System.out.println("permission-denied");
                    return;
                }
            }
        }
        System.out.println("success");
        resources.add(ganjineh);
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                i.setGanjinehLibrary(ganjinehId,i);
                break;
            }
        }

    }

    public void add_sellingBook(String managerId, String password,String sellingBookId, String title, String author, String publishers, String printYear, String amountOfCopy, String price, String discount, String categoryId, String libraryId){
        SellingBook sellingBook = new SellingBook(sellingBookId, title, author, publishers, printYear, amountOfCopy, price, discount, categoryId, libraryId);
        if(check_manager(managerId, password).equals("")){
            return;
        }
        if(check_library_category(categoryId,libraryId).equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)) {
                if (i.getSellingBookLibrary().containsKey(sellingBookId)) {
                    System.out.println("duplicate-id");
                    return;
                }
            }
        }

        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(! i.equals(i.getManagerOfLibrary().get(managerId))){
                    System.out.println("permission-denied");
                    return;
                }
            }
        }
        System.out.println("success");
        resources.add(sellingBook);
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                i.setSellingBookLibrary(sellingBookId,i);
                break;
            }
        }

    }

    public void remove_resource(String managerName, String password, String resourceId, String libraryId){
        if(check_manager(managerName,password).equals("")){
            return;
        }
        for(Library i : libraries){
            if(i.getLibraryId().equals(libraryId)){
                if(! i.equals(i.getManagerOfLibrary().get(managerName))){
                    System.out.println("permission-denied");
                    return;
                }
            }
        }
        Library library = null;
        boolean flag2 = false;
        for (Library i : libraries) {
            if (i.getLibraryId().equals(libraryId)) {
                flag2 = true;
                library = i;
                break;
            }
        }
        if (!flag2) {
            System.out.println("not-found");
            return;
        }
        int flag = 0;
        for(Resource i : resources){
            if(i.getSourceId().equals(resourceId)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("not-found");
            return;
        }

        /**
         * در صورتی که منبع در قرض کسی باشد امکان حذف
         * آن وجود ندارد و خروجی در این حالت allowed-not خواهد بود
         */

        System.out.println("success");
        Iterator<Resource> it = resources.iterator();
        while (it.hasNext()){
            Resource resource = it.next();
            if(resource.getSourceId().equals(resourceId)){
                it.remove();
            }
        }

        for(Resource i : resources){
            if(i instanceof Book){
                library.removeBooksLibrary(resourceId,library);
            }
            if(i instanceof Thesis){
                library.removeThesesLibrary(resourceId,library);
            }
            if(i instanceof Ganjineh){
                library.removeGanjinehLibrary(resourceId,library);
            }
            if(i instanceof SellingBook){
                library.removeSellingBookLibrary(resourceId,library);
            }
        }

    }

    public void borrow(String userId, String password, String libraryId, String itemId, String date, String time){
        Book book = findBook(itemId);
        Thesis thesis = findThesis(itemId);
        if(book == null && thesis == null){
            System.out.println("not-found");
            return;
        }
        Library library = findLibrary(libraryId);
        if(library == null){
            System.out.println("not-found");
            return;
        }

        Student student = findStudent(userId, password);
        Staff staff = findStaff(userId, password);
        Professor professor = findProfessor(userId);
        if(staff == null && student == null && professor == null){
            System.out.println("not-found");
            return;
        }
        if(student!= null && ! student.getPassword().equals(password)){
            System.out.println("invalid-pass");
            return;
        }
        if(staff != null && ! staff.getPassword().equals(password)){
            System.out.println("invalid-pass");
            return;
        }
        if(professor != null && ! professor.getPassword().equals(password)){
            System.out.println("invalid-pass");
            return;
        }

        for(Resource i : resources){
            if((i instanceof Ganjineh) && i.getSourceId().equals(itemId)){
                System.out.println("not-allowed");
                return;
            }
            if((i instanceof SellingBook) && i.getSourceId().equals(itemId)){
                System.out.println("not-allowed");
                return;
            }
        }
        if(student != null && student.getNumberOfBorrowBooks() >= 3){
            System.out.println("not-allowed");
            return;
        }
        if(staff != null && staff.getNumberOfBorrowBooks() >= 5){
            System.out.println("not-allowed");
            return;
        }
        if(professor != null && professor.getNumberOfBorrowBooks() >= 5){
            System.out.println("not-allowed");
            return;
        }

        if((book != null && book.getNumberOfBooks() <= 0)){
            System.out.println("not-allowed");
            return;
        }

        if(student != null && book != null){
            if(book.equals(student.getBorrowedItems().get(userId))){
                System.out.println("not-allowed");
                return;
            }
        }
        if(staff != null && book != null){
            if(book.equals(staff.getBorrowedItems().get(userId))){
                System.out.println("not-allowed");
                return;
            }}
        if(professor != null && book != null){
            if(book.equals(professor.getBorrowedItems().get(userId))){
                System.out.println("not-allowed");
                return;
            }
        }


        if((thesis!= null && thesis.getNumberOfThesis() <= 0)){
            System.out.println("not-allowed");
            return;
        }


        System.out.println("success");

        if(student != null && student.getNumberOfBorrowBooks() <= 3){
            student.setNumberOfBorrowBooks(student.getNumberOfBorrowBooks() + 1);
            if(book != null){
                book.setNumberOfBooks(book.getNumberOfBooks() - 1);
                student.setBorrowedItems(itemId,book);
            }else{
                thesis.setNumberOfThesis(0);
            }
        }
        if(staff != null && staff.getNumberOfBorrowBooks() <= 5){
            staff.setNumberOfBorrowBooks(staff.getNumberOfBorrowBooks() + 1);
            if(book != null){
                book.setNumberOfBooks(book.getNumberOfBooks() - 1);
                staff.setBorrowedItems(itemId, book);
            }else{
                thesis.setNumberOfThesis(0);
            }
        }
        if(professor != null && professor.getNumberOfBorrowBooks() <= 5){
            professor.setNumberOfBorrowBooks(professor.getNumberOfBorrowBooks() + 1);
            if(book != null){
                book.setNumberOfBooks(book.getNumberOfBooks() - 1);
                professor.setBorrowedItems(itemId, book);
            }else{
                thesis.setNumberOfThesis(0);
            }
        }


    }


    public void returnSource(){

    }








    public String check_admin(String adminName , String password){

        int flag1 = 0;
        for(Person i : people) {
            if (!(i instanceof Admin)) {
                if (i.getId().equals(adminName)) {
                    System.out.println("permission-denied");
                    return "";
                }
            }
        }
        if (! password.equals("AdminPass")) {
            System.out.println("invalid-pass");
            return "";
        }
        if (! adminName.equals("admin")) {
            System.out.println("not-found");
            return "";
        }
        return "success";

    }

    public String check_manager(String managerName , String password){
        int flag = 0 , temp = 0;

        for(Person i : people){
            if(!(i instanceof Manager)){
                if(i.getId().equals(managerName)){
                    System.out.println("permission-denied");
                    return "";
                }
            }
        }


        for(Person i : people){
            if(i instanceof Manager) {
                if (i.getId().equals(managerName)) {
                    flag = 1;
                    if (i.getPassword().equals(password)) {
                        temp = 1;
                        break;
                    }
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("not-found");
            return "";
        }
        if(temp == 0){
            System.out.println("invalid-pass");
            return "";
        }

        return "success";

    }


    public String check_library_category(String categoryId, String libraryId){
        boolean flag1 = false;
        for (Category i : allCategories) {
            if (i.getCategoryId().equals(categoryId) || categoryId.equals("null")) {
                flag1 = true;
                break;
            }
        }
        if (!flag1) {
            System.out.println("not-found");
            return "";
        }

        boolean flag2 = false;
        for (Library i : libraries) {
            if (i.getLibraryId().equals(libraryId)) {
                flag2 = true;
                break;
            }
        }
        if (!flag2) {
            System.out.println("not-found");
            return "";
        }
        return "success";

    }


    private Library findLibrary(String libraryId) {
        for (Library library : libraries) {
            if (library.getLibraryId().equals(libraryId)) {
                return library;
            }
        }
        return null;
    }

    private Book findBook(String bookId) {
        for (Resource resource : resources) {
            if(resource instanceof Book){
                if(resource.getSourceId().equals(bookId)) {
                    return (Book) resource;
                }
            }
        }
        return null;
    }

    private Thesis findThesis(String thesisId){
        for (Resource resource : resources) {
            if(resource instanceof Thesis){
                if(resource.getSourceId().equals(thesisId)) {
                    return (Thesis) resource;
                }
            }
        }
        return null;
    }


    private Student findStudent(String studentId, String password) {
        for(Person person : people){
            if(person instanceof Student){
                if(person.getId().equals(studentId)){
                    return (Student) person;
                }
            }
        }
        return null;
    }

    private Staff findStaff(String staffId, String password){
        for(Person person : people){
            if(person instanceof Staff){
                if(person.getId().equals(staffId)){
                    return (Staff) person;
                }
            }
        }
        return null;
    }

    private Professor findProfessor(String professorId){
        for(Person person : people){
            if(person instanceof Professor){
                if(person.getId().equals(professorId)){
                    return (Professor) person;
                }
            }
        }
        return null;
    }


    private Category findCategory(String categoryId){
        for(Category category : categories){
            if(category.getCategoryId().equals(categoryId)){
                return category;
            }
        }
        return null;
    }


}