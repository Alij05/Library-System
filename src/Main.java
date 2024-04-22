import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LibrarySystem center = new LibrarySystem();

        while (true) {
            String[] str = input.nextLine().split("[|#]");

            if(str[0].equals("add-library")){
                center.add_library(str[1],str[2],str[3],str[4],str[5],Integer.valueOf(str[6]),str[7]);
            }
            else if(str[0].equals("add-category")){
                center.add_category(str[1],str[2],str[3],str[4],str[5]);
            }
            else if(str[0].equals("add-student")){
                center.add_student(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9]);
            }
            else if(str[0].equals("add-staff")){
                center.add_staff(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10]);
            }
            else if(str[0].equals("add-manager")){
                center.add_manager(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10]);
            }
            else if(str[0].equals("remove-user")){
                center.remove_user(str[1],str[2],str[3]);
            }




            else if(str[0].equals("finish")){
                return;
            }

        }


   }
}


/**
 *  TEST CASE 1
 */

/*
add-library#someone|AdminPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|WrongPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|AdminPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|AdminPass|L002|AUT CE Library|1389|30|AUT CE
add-category#someone|AdminPass|C001|Computer|null
add-category#admin|WrongPass|C001|Computer|null
add-category#admin|AdminPass|C002|Computer Science|C001
add-category#admin|AdminPass|C001|Computer|null
add-category#admin|AdminPass|C002|Computer Science|C001
add-category#admin|AdminPass|C003|Computer Engineering|C001
add-student#someone|AdminPass|9731085|passWORD|Student1Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|WrongPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|AdminPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|AdminPass|9831080|1234$%!|Student2 Name|Student2 Family|0123456777|1383|Tehran, Hafte Tir
add-staff#someone|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|WrongPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131002|AAAA|Staff2Name|Staff2Family|0123556789|1365|Tehran, Tajrish|staff
add-staff#someone|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|WrongPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|1131004|123456|Prof2Name|Prof2Family|0121116789|1340|Tehran, Gholhak|professor
add-manager#someone|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|WrongPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L003
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|0010002|knB123|Manager2Name|Manager2Family|0129996789|1342|Tehran, Vanak|L002
add-library#admin|AdminPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|AdminPass|L002|AUT CE Library|1389|30|AUT CE
add-category#admin|AdminPass|C001|Computer|null
add-category#admin|AdminPass|C002|Computer Science|Computer
add-student#admin|AdminPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|AdminPass|9831080|1234$%!|Student2 Name|Student2 Family|0123456777|1383|Tehran, Hafte Tir
add-staff#admin|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|9731085|passWORD|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131002|AAAA|Staff2Name|Staff2Family|0123556789|1365|Tehran, Tajrish|staff
add-staff#admin|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|9731085|passWORD|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|1131004|123456|Prof2Name|Prof2Family|0121116789|1340|Tehran, Gholhak|professor
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|9731085|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|1131001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|1131003|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|0010002|knB123|Manager2Name|Manager2Family|0129996789|1342|Tehran, Vanak|L002
add-library#9731085|passWORD|L001|Central Library|1340|60|AUT Saboori
add-library#1131001|MyPass|L001|Central Library|1340|60|AUT Saboori
add-library#1131003|Korosu|L001|Central Library|1340|60|AUT Saboori
add-library#0010001|Man*&@|L001|Central Library|1340|60|AUT Saboori
add-category#9831080|1234$%!|C002|Computer Science|Computer
add-category#1131002|AAAA|C002|Computer Science|Computer
add-category#1131004|123456|C002|Computer Science|Computer
add-category#0010002|knB123|C002|Computer Science|Computer
add-student#9731085|passWORD|9831080|1234$%!|SecondStudentName|SecondStudentFamily|0123456777|1383|Tehran, Hafte Tir
add-student#1131001|MyPass|9831080|1234$%!|SecondStudentName|SecondStudentFamily|0123456777|1383|Tehran, Hafte Tir
add-student#1131003|Korosu|9831080|1234$%!|SecondStudentName|SecondStudentFamily|0123456777|1383|Tehran, Hafte Tir
add-student#0010001|Man*&@|9831080|1234$%!|SecondStudentName|SecondStudentFamily|0123456777|1383|Tehran, Hafte Tir
add-staff#9731085|passWORD|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#1131001|MyPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#1131004|123456|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#0010002|knB123|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#9731085|passWORD|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#1131001|MyPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#1131004|123456|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#0010002|knB123|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-manager#9731085|passWORD|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#1131001|MyPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#1131004|123456|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#0010002|knB123|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
remove-user#9731085|passWORD|9731085
remove-user#1131001|MyPass|9731085
remove-user#1131004|123456|9731085
remove-user#0010002|knB123|9731085
remove-user#someone|AdminPass|9731085
remove-user#admin|WrongPass|9731085
remove-user#admin|AdminPass|9731085
remove-user#admin|AdminPass|1131001
remove-user#admin|AdminPass|1131003
remove-user#admin|AdminPass|0010001
remove-user#admin|AdminPass|9731085
remove-user#admin|AdminPass|1131001
remove-user#admin|AdminPass|1131003
remove-user#admin|AdminPass|0010001
add-student#admin|AdminPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-staff#admin|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
finish




not-found
invalid-pass
success
success
not-found
invalid-pass
not-found
success
success
success
not-found
invalid-pass
success
success
not-found
invalid-pass
success
success
not-found
invalid-pass
success
success
not-found
invalid-pass
not-found
success
success
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
duplicate-id
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
permission-denied
not-found
invalid-pass
success
success
success
success
not-found
not-found
not-found
not-found
success
success
success
success

 */
















/*
public void check_admin(String adminName , String password , String id){

        int flag = 0;
        for(Person i : people){
            if(!adminName.equals("admin")) {
                if (i.getId().equals(adminName)) {
                    flag = 1;
                    break;
                }
            }
        }

        if(!password.equals("AdminPass")){
            System.out.println("invalid-pass");
            return ;
        }
        if(flag == 1){
            System.out.println("permission-denied");
            return;
        }
        if(!adminName.equals("admin")){
            System.out.println("not-found");
            return ;
        }

        for(Library i : libraries){
            if(i.getLibraryId().equals(id)){
                System.out.println("duplicate-id");
                return;
            }
        }
        System.out.println("success");

    }
 */



/*

Based on the description provided, let's identify the classes and their inheritance relationships:

LibraryItem (abstract class):
This class represents any item in the library and serves as the superclass for specific types of items.
Properties: title, author/artist, year, unique ID.
Book (subclass of LibraryItem):
Inherits from LibraryItem.
Additional properties: ISBN, genre.
Thesis (subclass of LibraryItem):
Inherits from LibraryItem.
Similar to Book but for theses.
ReferenceBook (subclass of LibraryItem):
Inherits from LibraryItem.
Similar to Book but denotes books that cannot be borrowed.
PurchasedBook (subclass of LibraryItem):
Inherits from LibraryItem.
Represents books available for sale in the library.
User (abstract class):
Represents users of the system and serves as the superclass for specific types of users.
AdminUser (subclass of User):
Inherits from User.
Allows special commands like adding users.
Student (subclass of User):
Inherits from User.
Represents students who can borrow or return items and manage these processes.
Employee (subclass of User):
Inherits from User.
Represents employees who can borrow or return items and manage these processes.
Professor (subclass of User):
Inherits from User.
Represents professors who can borrow or return items and manage these processes.
LibraryManager (subclass of User):
Inherits from User.
Represents library staff with permissions to manage library operations.
Category (class):
Represents categories for organizing items (e.g., by academic discipline).
Library (class):
Manages library resources and operations.
Contains multiple libraries and facilitates borrowing from them.
Comment (class):
Represents comments that users (except library officials) can add to items.
Permissions (interface):
Defines different permissions for users.
Implemented by classes representing user types.
This structure provides a foundation for managing library resources, users, categories, and permissions effectively using inheritance in Java. You can further refine and expand these classes based on specific requirements and functionalities of your library management system.

 */