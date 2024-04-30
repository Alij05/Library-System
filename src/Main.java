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
            else if(str[0].equals("add-book")){
                center.add_book(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10]);
            }
            else if(str[0].equals("add-thesis")){
                center.add_thesis(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9]);
            }
            else if(str[0].equals("add-ganjineh-book")){
                center.add_ganjineh(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10]);
            }
            else if(str[0].equals("add-selling-book")){
                center.add_sellingBook(str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9],str[10],str[11],str[12]);
            }
            else if(str[0].equals("remove-resource")){
                center.remove_resource(str[1],str[2],str[3],str[4]);
            }
            else if(str[0].equals("borrow")){
                center.borrow(str[1],str[2],str[3],str[4],str[5],str[6]);
            }
            else if(str[0].equals("return")){
                center.returnSource(str[1],str[2],str[3],str[4],str[5],str[6]);
            }
            else if(str[0].equals("buy")){
                center.buy(str[1],str[2],str[3],str[4]);
            }




            else if(str[0].equals("finish")){
                return;
            }

        }


    }
}


/**
 *  TEST CASE 3
 */

/*
add-library#admin|AdminPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|AdminPass|L002|AUT CE Library|1389|30|AUT CE
add-category#admin|AdminPass|C001|Computer|null
add-category#admin|AdminPass|C002|Computer Science|C001
add-category#admin|AdminPass|C003|Computer Engineering|C001
add-student#admin|AdminPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|AdminPass|9831080|1234$%!|Student2 Name|Student2 Family|0123456777|1383|Tehran, Hafte Tir
add-staff#admin|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131002|AAAA|Staff2Name|Staff2Family|0123556789|1365|Tehran, Tajrish|staff
add-staff#admin|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|1131004|123456|Prof2Name|Prof2Family|0121116789|1340|Tehran, Gholhak|professor
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|0010002|knB123|Manager2Name|Manager2Family|0129996789|1342|Tehran, Vanak|L002
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L001
add-book#0010001|Man*&@|B002|Data Structures and Algorithms Made Easy|Author2|Publisher2|2014|6|C002|L001
add-book#0010001|Man*&@|B003|Advanced Software Engineering Techniques|Author3|Publisher3|2016|2|C003|L001
add-book#0010002|knB123|B001|Advanced Software Engineering Techniques|Author3|Publisher3|2016|3|C003|L002
add-book#0010002|knB123|B002|Computer Networks|Author4|Publisher4|2016|6|C003|L002
add-book#0010002|knB123|B003|Startup Development Techniques|Author5|Publisher5|2014|5|null|L002
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-thesis#0010001|Man*&@|T02|Thesis2|Student2Name|Professor2Name|1400|C003|L001
add-thesis#0010002|knB123|T01|Thesis3|Student3Name|Professor3Name|1398|null|L002
add-ganjineh-book#0010001|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L001
add-ganjineh-book#0010001|Man*&@|B005|GanjinehBook2|Author6|Publisher6|2005|null|null|L001
add-ganjineh-book#0010002|knB123|B004|GanjinehBook3|Author7|Publisher7|2001|null|C003|L002
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|2|50000|20|C001|L001
add-selling-book#0010002|knB123|B005|Introduction to Python|Author8|Publisher8|2016|20|50000|10|C001|L002
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
borrow#someone|passWORD|L001|B001|2023-04-1|15:00
borrow#9731085|WrongPass|L001|B001|2023-04-1|15:00
borrow#9731085|passWORD|L004|B001|2023-04-1|15:00
borrow#9731085|passWORD|L001|B008|2023-04-1|15:00
borrow#9731085|passWORD|L001|B005|2023-04-1|15:00
borrow#9731085|passWORD|L001|B006|2023-04-1|15:00
borrow#9731085|passWORD|L001|B001|2023-04-1|15:00
borrow#9731085|passWORD|L001|T01|2023-04-1|15:00
borrow#9731085|passWORD|L001|B003|2023-04-3|12:00
borrow#9731085|passWORD|L002|B002|2023-04-4|17:00
borrow#1131001|MyPass|L001|B001|2023-04-2|16:00
borrow#1131001|MyPass|L001|B002|2023-04-2|16:00
borrow#1131001|MyPass|L001|B003|2023-04-2|16:00
borrow#1131001|MyPass|L002|B001|2023-04-3|13:00
borrow#1131001|MyPass|L002|B002|2023-04-3|15:00
borrow#1131001|MyPass|L002|B003|2023-04-4|15:00
borrow#1131003|Korosu|L001|B003|2023-04-5|11:00
borrow#1131003|Korosu|L002|B002|2023-04-5|13:00
borrow#9731085|passWORD|L001|B001|2023-04-5|15:00
remove-user#admin|AdminPass|9731085
remove-user#admin|AdminPass|1131001
remove-user#admin|AdminPass|1131003
remove-resource#0010001|Man*&@|B001|L001
remove-resource#0010001|Man*&@|T01|L001
remove-resource#0010001|Man*&@|B003|L001
remove-resource#0010002|knB123|B002|L002
return#someone|passWORD|L001|B001|2023-04-8|17:00
return#9731085|WrongPass|L001|B001|2023-04-8|17:00
return#9731085|passWORD|L004|B001|2023-04-8|17:00
return#9731085|passWORD|L001|B008|2023-04-8|17:00
return#9731085|passWORD|L001|T01|2023-04-8|12:00
return#9731085|passWORD|L001|B003|2023-04-8|11:00
return#9731085|passWORD|L002|B002|2023-04-8|17:00
return#9731085|passWORD|L001|B001|2023-04-8|17:00
return#1131001|MyPass|L001|B001|2023-04-5|16:00
return#1131001|MyPass|L001|B002|2023-04-5|16:00
return#1131001|MyPass|L001|B003|2023-04-5|16:00
return#1131001|MyPass|L002|B001|2023-04-5|16:00
return#1131001|MyPass|L002|B002|2023-04-17|18:00
return#1131001|MyPass|L002|B003|2023-04-18|18:00
return#1131003|Korosu|L002|B002|2023-04-8|13:00
borrow#1131003|Korosu|L001|B003|2023-04-10|12:00
borrow#9731085|passWORD|L002|B003|2023-04-10|15:00
buy#someone|passWORD|L001|B006
buy#9731085|WrongPass|L001|B006
buy#9731085|passWORD|L004|B006
buy#9731085|passWORD|L001|B008
buy#9731085|passWORD|L001|B006
buy#1131001|MyPass|L001|B006
buy#9831080|1234$%!|L001|B006
buy#1131003|Korosu|L001|B006
buy#1131004|123456|L001|B006
buy#1131004|123456|L002|B005
buy#1131004|123456|L002|B001
buy#1131004|123456|L002|T01
buy#0010001|Man*&@|L002|B005
read#someone|123456|L001|B004|2023-04-11|15:00
read#1131004|WrongPass|L001|B004|2023-04-11|15:00
read#1131004|123456|L004|B004|2023-04-11|15:00
read#1131004|123456|L001|B008|2023-04-11|15:00
read#1131004|123456|L001|B001|2023-04-11|15:00
read#1131004|123456|L001|T01|2023-04-11|15:00
read#9731085|passWORD|L001|B004|2023-04-11|15:00
read#1131004|123456|L001|B004|2023-04-11|15:00
read#1131003|Korosu|L001|B004|2023-04-11|16:00
read#1131003|Korosu|L001|B004|2023-04-11|17:30
read#1131003|Korosu|L002|B004|2023-04-12|12:00
search#ji
search#Modern Software Engineering
search-user#someone|AAAA|Ali
search-user#1131002|WrongPass|ar
finish



success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
success
not-found
invalid-pass
duplicate-id
duplicate-id
not-found
invalid-pass
duplicate-id
duplicate-id
duplicate-id
duplicate-id
not-found
invalid-pass
duplicate-id
duplicate-id
not-found
invalid-pass
duplicate-id
duplicate-id
not-found
invalid-pass
duplicate-id
duplicate-id
not-found
invalid-pass
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
not-found
invalid-pass
not-found
not-found
not-allowed
not-allowed
success
success
success
not-allowed
success
success
success
success
success
not-allowed
not-allowed
success
not-allowed
not-allowed
not-allowed
not-allowed
not-allowed
not-allowed
not-allowed
not-allowed
not-found
invalid-pass
not-found
not-found
success
success
not-found
success
success
success
success
success
300
not-found
success
success
success
not-found
invalid-pass
not-found
not-found
success
not-allowed
success
not-allowed
not-allowed
success
not-allowed
not-allowed
permission-denied
not-found
invalid-pass
not-found
not-found
not-allowed
not-allowed
permission-denied
success
not-allowed
success
success
B004|B004|B005
not-found
not-found
invalid-pass


 */




/**
 *  TEST CASE 2
 */

/*

add-library#admin|AdminPass|L001|Central Library|1340|60|AUT Saboori
add-library#admin|AdminPass|L002|AUT CE Library|1389|30|AUT CE
add-category#admin|AdminPass|C001|Computer|null
add-category#admin|AdminPass|C002|Computer Science|C001
add-category#admin|AdminPass|C003|Computer Engineering|C001
add-student#admin|AdminPass|9731085|passWORD|Student1 Name|Student1 Family|0123456789|1379|Tehran, Saadat Abad
add-student#admin|AdminPass|9831080|1234$%!|Student2 Name|Student2 Family|0123456777|1383|Tehran, Hafte Tir
add-staff#admin|AdminPass|1131001|MyPass|Staff1Name|Staff1Family|0123446789|1360|Tehran, Azadi|staff
add-staff#admin|AdminPass|1131002|AAAA|Staff2Name|Staff2Family|0123556789|1365|Tehran, Tajrish|staff
add-staff#admin|AdminPass|1131003|Korosu|Prof1Name|Prof1Family|0123336789|1350|Tehran, Velenjak|professor
add-staff#admin|AdminPass|1131004|123456|Prof2Name|Prof2Family|0121116789|1340|Tehran, Gholhak|professor
add-manager#admin|AdminPass|0010001|Man*&@|Manager1Name|Manager1Family|0128886789|1345|Tehran, Tajrish|L001
add-manager#admin|AdminPass|0010002|knB123|Manager2Name|Manager2Family|0129996789|1342|Tehran, Vanak|L002
add-book#someone|Man*&@|B001|Introduction to Java|Author1|Springer1|2021|5|C001|L001
add-book#0010001|WrongPass|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L001
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L004
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C004|L001
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L001
add-book#0010001|Man*&@|B002|Data Structures and Algorithms Made Easy|Author2|Publisher2|2014|6|C002|L001
add-book#0010001|Man*&@|B003|Advanced Software Engineering Techniques|Author3|Publisher3|2016|2|C003|L001
add-book#0010002|knB123|B001|Advanced Software Engineering Techniques|Author3|Publisher3|2016|3|C003|L002
add-book#0010002|knB123|B002|Computer Networks|Author4|Publisher4|2016|6|C003|L002
add-book#0010002|knB123|B003|Startup Development Techniques|Author5|Publisher5|2014|5|null|L002
add-thesis#someone|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-thesis#0010001|WrongPass|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L004
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C004|L001
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-thesis#0010001|Man*&@|T02|Thesis2|Student2Name|Professor2Name|1400|C003|L001
add-thesis#0010002|knB123|T01|Thesis3|Student3Name|Professor3Name|1398|null|L002
add-ganjineh-book#someone|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L001
add-ganjineh-book#0010001|WrongPass|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L001
add-ganjineh-book#0010001|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L004
add-ganjineh-book#0010001|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C004|L001
add-ganjineh-book#0010001|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L001
add-ganjineh-book#0010001|Man*&@|B005|GanjinehBook2|Author6|Publisher6|2005|null|null|L001
add-ganjineh-book#0010002|knB123|B004|GanjinehBook3|Author7|Publisher7|2001|null|C003|L002
add-selling-book#someone|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L001
add-selling-book#0010001|WrongPass|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L001
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L004
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C004|L001
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L001
add-selling-book#0010002|knB123|B005|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L002
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L001
add-book#0010002|knB123|B001|Advanced Software Engineering Techniques|Author3|Publisher3|2016|3|C003|L002
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-thesis#0010002|knB123|T01|Thesis3|Student3Name|Professor3Name|1398|null|L002
add-ganjineh-book#0010001|Man*&@|B004|GanjinehBook1|Author5|Publisher5|2003|Mr.Mashhadi|C002|L001
add-ganjineh-book#0010002|knB123|B004|GanjinehBook3|Author7|Publisher7|2001|null|C003|L002
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L001
add-selling-book#0010002|knB123|B005|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L002
add-book#0010002|knB123|B007|SomeBook|SomeAuthor|SomePublisher|2021|5|C001|L001
add-book#9731085|passWORD|B007|SomeBook|SomeAuthor|SomePublisher|2021|5|C001|L001
add-book#1131001|MyPass|B007|SomeBook|SomeAuthor|SomePublisher|2021|5|C001|L001
add-book#1131003|Korosu|B007|SomeBook|SomeAuthor|SomePublisher|2021|5|C001|L001
add-book#0010001|Man*&@|B006|SomeBook|SomeAuthor|SomePublisher|2021|5|C001|L002
add-thesis#0010002|knB123|T03|SomeThesis|SomeStudentName|SomeProfessorName|1399|C002|L001
add-thesis#9731085|passWORD|T03|SomeThesis|SomeStudentName|SomeProfessorName|1399|C002|L001
add-thesis#1131001|MyPass|T03|SomeThesis|SomeStudentName|SomeProfessorName|1399|C002|L001
add-thesis#1131003|Korosu|T03|SomeThesis|SomeStudentName|SomeProfessorName|1399|C002|L001
add-thesis#0010001|Man*&@|T02|SomeThesis|SomeStudentName|SomeProfessorName|1399|C002|L002
add-ganjineh-book#0010002|knB123|B007|SomeGanjinehBook|SomeAuthor|SomePublisher|2003|null|C002|L001
add-ganjineh-book#9731085|passWORD|B007|SomeGanjinehBook|SomeAuthor|SomePublisher|2003|null|C002|L001
add-ganjineh-book#1131001|MyPass|B007|SomeGanjinehBook|SomeAuthor|SomePublisher|2003|null|C002|L001
add-ganjineh-book#1131003|Korosu|B007|SomeGanjinehBook|SomeAuthor|SomePublisher|2003|null|C002|L001
add-ganjineh-book#0010001|Man*&@|B006|SomeGanjinehBook|SomeAuthor|SomePublisher|2003|null|C002|L002
add-selling-book#0010002|knB123|B007|SomeBook|AAA|SomePublisher|2016|40|50000|20|C001|L001
add-selling-book#9731085|passWORD|B007|SomeBook|AAA|SomePublisher|2016|40|50000|20|C001|L001
add-selling-book#1131001|MyPass|B007|SomeBook|AAA|SomePublisher|2016|40|50000|20|C001|L001
add-selling-book#1131003|Korosu|B007|SomeBook|AAA|SomePublisher|2016|40|50000|20|C001|L001
add-selling-book#0010001|Man*&@|B006|SomeBook|AAA|SomePublisher|2016|40|50000|20|C001|L002
remove-resource#0010002|knB123|B001|L001
remove-resource#9731085|passWORD|B001|L001
remove-resource#1131001|MyPass|B001|L001
remove-resource#1131003|Korosu|B001|L001
remove-resource#0010001|Man*&@|B001|L002
remove-resource#someone|Man*&@|B001|L001
remove-resource#0010001|WrongPass|B001|L001
remove-resource#0010001|Man*&@|B001|L004
remove-resource#0010001|Man*&@|B008|L001
remove-resource#0010001|Man*&@|B001|L001
remove-resource#0010001|Man*&@|T01|L001
remove-resource#0010001|Man*&@|B006|L001
remove-resource#0010002|knB123|B004|L002
remove-resource#0010001|Man*&@|B001|L001
remove-resource#0010001|Man*&@|T01|L001
remove-resource#0010001|Man*&@|B006|L001
remove-resource#0010002|knB123|B004|L002
add-book#0010001|Man*&@|B001|Introduction to Java|Author1|Publisher1|2021|5|C001|L001
add-thesis#0010001|Man*&@|T01|Thesis1|Student1Name|Professor1Name|1399|C002|L001
add-selling-book#0010001|Man*&@|B006|Introduction to Python|Author8|Publisher8|2016|40|50000|20|C001|L001
add-ganjineh-book#0010002|knB123|B004|GanjinehBook3|Author7|Publisher7|2001|null|C003|L002
finish


success
success
success
success
success
success
success
success
success
success
success
success
success
not-found
invalid-pass
not-found
not-found
success
success
success
success
success
success
not-found
invalid-pass
not-found
not-found
success
success
success
not-found
invalid-pass
not-found
not-found
success
success
success
not-found
invalid-pass
not-found
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
not-found
not-found
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