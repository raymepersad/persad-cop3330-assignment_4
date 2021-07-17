/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 RAYME PERSAD

 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

class todoControllerTest {

    @Test
    void addNewTodoList() {
        // new todo list
        //add new list to directory
    }

    @Test
    void removeExistingTodoList() {
        //removes existing list from directory
        //prompts for if sure to remove
        //asks if items are also removed
    }

    @Test
    void editExistingListTitle() {
        //edits title for existing list
        //prompts to choose list
    }

    @Test
    void addNewItem() {
        //prompt to add new item to existing list or new list
        //adds item with no associated list
    }

    @Test
    void removeExistingItem() {
        //removes item from list new or existing
    }

    @Test
    void editItemDescriptionExistingTodoList() {
        //changes item description in existing list
        //compares to old description and prompts to confirm changes
    }

    @Test
    void editItemDueDateExistingTodoList() {
        //changes due date of existing list
        //get the current date
        //changes to new date
        //prompts to confirm date
    }

    @Test
    void markItemCompleteExistingTodoList() {
        //checks if item is completed
        //marks item as completed
    }

    @Test
    void displayExistingItemsTodoList() {
        //shows item on todo list
    }

    @Test
    void displayIncompletedItemsTodoList() {
        //shows items that are not completed
        //checks to see items that are done or not done
    }

    @Test
    void displayCompletedTodoList() {
        //checks existing lists that have all items completed
    }

    @Test
    void saveItemsSingleListToExternalStorage() {
        //checks external storage available
        //checks items in certain list to save
    }

    @Test
    void saveAllItemsToExternalStorage() {
        //save items in lists to external storage
    }

    @Test
    void loadSingleListFromExternalStorage() {
        //checks external storage
        //chooses list
        //checks to se eif list is already available
    }

    @Test
    void loadMultipleListsFromExternalStorage() {
        //checks external storage
        //prompts lists to load
        //checks to see if lists are already loaded or not
    }
}