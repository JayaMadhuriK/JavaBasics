import java.util.*;
class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int choice;
        System.out.println(".......Menu......");
        System.out.println("1.add/n2.remove/n3.display/n4.exit");
        do{
        System.out.println("enter your choice: ");
        choice = sc.nextInt();
        switch(choice){
            case 1:System.out.println("enter element to add");
            int elem = sc.nextInt();
            list.add(elem);
            System.out.println("element added");
            break;
            case 2:System.out.println("enter element to remove");
            int elem1 = sc.nextInt();
            
            if(list.contains(elem1)){
             int c = list.indexOf(elem1);
              list.remove(c);
              System.out.println("element deleted");
            }
            else{
            System.out.println("list does not contain element " + elem1);
            }
           
            break;
            case 3:
                System.out.println("Elements in the list: ");
                list.forEach((n)->System.out.println(n));
                break;
            case 4:System.out.println("Quiting...");
            System.exit(0);
            sc.close();
            default:System.out.println("enter correct option");
            break;
        }
    }while(choice<=4);
    }
}
