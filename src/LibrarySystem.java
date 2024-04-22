import java.util.ArrayList;
import java.util.Iterator;

public class LibrarySystem {
    private ArrayList<Library> libraries;
    private ArrayList<Category> categories;
    private ArrayList<Category> nullCategory;
    private ArrayList<Category> allCategories;
    private ArrayList<Person> people;
    private Person a;

    public LibrarySystem(){
        this.libraries = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.nullCategory = new ArrayList<>();
        this.allCategories = new ArrayList<>();
        this.people = new ArrayList<>();
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

        for (Person i : people) {
            if (i.getId().equals(managerId)){
                System.out.println("duplicate-id");
                return;
            }
        }
        System.out.println("success");
        people.add(manager);

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






    public String check_admin(String adminName , String password){

        int flag1 = 0;
        for(Person i : people) {
            if (!(i instanceof Admin)) {
                if (i.getId().equals(adminName)) {
//                    flag1 = 1;
//                    break;
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

}
