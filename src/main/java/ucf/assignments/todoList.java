/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 RAYME PERSAD
 */


package ucf.assignments;

public class ToDoList {
    private String[] todo; //storage of tasks
    private int count;     //how many tasks have been added to todo


    /*Creates todo list with capacity of 100*/
    public ToDoList() {
        this.todo = new String[100];
        this.count = 0;
    }

    /* adds item and returns if true */
    public boolean add(String item) {
        if (this.count == this.todo.length) {
            return false;  //can't add item to list
        }else {
            this.todo[count] = item;
            this.count++;
            return true;
        }
    }

    /*Returns item count in list*/
    public int getSize() {
        return count;
    }

    /*removes item and returns unless null*/
    public String remove(int index) {
        if (index < 1 || index > this.count) {
            return null;  // there isnt an item like that
        }else {
            index--;  //convert to 0-based indexing used by array
            String deleted = this.todo[index];
            //delete by moving down into removed item's space
            for (int i = index; i < this.count - 1; i++) {
                this.todo[i] = this.todo[i + 1];
            }
            this.count--;  //removed an item
            return deleted;
        }
    }

    /*returns sting of list of tasks*/
    public String toString() {
        String output = "TODO:\n";
        for (int i = 0; i < this.count; i++) {
            output += (i + 1) + ". " + this.todo[i] + "\n";
        }
        return output;
    }



    /*menu based to be implemented with GUI*/
    public static void main(String[] args) {

        java.util.Scanner keybd = new java.util.Scanner(System.in);
        ToDoList list = new ToDoList();

        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println(list);  //calls toString()

            //print menu choices
            System.out.println("MENU:");
            System.out.println("1 - Add item");
            System.out.println("2 - Remove last item");
            System.out.println("3 - Remove specific item");
            System.out.println("0 - Quit");
            System.out.print("Enter your menu choice: ");

            //process user's menu choice
            try {
                choice = keybd.nextInt();
                keybd.nextLine();
                switch (choice) {
                    case 1:  //ADDS ITEM(S)
                        System.out.print("ENTER A TASK: ");
                        String task = keybd.nextLine();
                        boolean added = list.add(task);
                        if (!added) {
                            System.out.println("Sorry, but this to-do list is already full with 100 things!");
                        }
                        break;

                    case 2:  //REMOVE LAST
                        String removed = list.remove(list.getSize());
                        if (removed != null) {
                            System.out.println("Removed: " + removed);
                        }else {
                            System.out.println("The to-do list is empty.");
                        }
                        break;

                    case 3:  //REMOVE AT
                        System.out.print("Enter the number of the item to remove: ");
                        int index = keybd.nextInt();
                        removed = list.remove(index);
                        if (removed != null) {
                            System.out.println("Removed: " + removed);
                        }else {
                            System.out.println("There is no item to be removed with that number " +
                                    index + ".");
                        }
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Sorry, but " + choice + " is not one of " +
                                "the menu choices. Please try again.");
                        break;
                }
            }catch (java.util.InputMismatchException ime) {
                System.out.println("Sorry, but you must enter a number.");
                keybd.nextLine();  //clear bad input from stream
            }
        }//end while
    }//end main

}


/* extra code for GUI

    ArrayList todoList = new ArrayList();
    newRequirement(todoList);
    System.out.println(todoList);
     }//end of main method


    public static ArrayList newRequirement(ArrayList input){
    Scanner input1 = new Scanner(System.in);
    String inputDescription;
    String inputDate;
    Boolean inputComplete = false;
    //function uses prompts as a prototype function to be modified for GUI

    System.out.println("please enter the new requirement description");
    inputDescription = input1.nextLine();

    System.out.println("please enter a due date in YYYY-MM-DD including dashes");
    inputDate = input1.nextLine();
    //boolean requirement prompt

    System.out.println("If both description and due date were provided, enter 1");
    int booleanTest = 0;
    booleanTest = input1.nextInt();

    if( booleanTest == 1)
    inputComplete = true;

    requirement requirementTask = new requirement( inputDescription, inputDate, inputComplete);
    input.add(requirementTask);
    return input;
}//end new requirement function
}
 */