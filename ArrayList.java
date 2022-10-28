public class ArrayList {
    private int[] array;
    private int currentSize;
   
    public ArrayList() {
    this(20);
    }
   
    public ArrayList(int size) {
    array = new int[size];
    currentSize = 0;
    }
   
    public void insertItem(int item) {
    if (currentSize < array.length) {
    int insertLocation = findLocationInsert(item);
    for (int i = currentSize - 1; i >= insertLocation; i--) {
    array[i + 1] = array[i];
    }
    array[insertLocation] = item;
    currentSize++;
    }
    }
   
    private int findLocationInsert(int item) {
    for (int i = 0; i < currentSize; i++) {
    if (array[i] > item) {
    return i;
    }
    }
    return currentSize;
    }
   
    public void deleteItem(int item) {
    int deleteLocation = findLocationDelete(item);
    if (deleteLocation != -1) {
    for (int i = deleteLocation + 1; i < currentSize; i++) {
    array[i - 1] = array[i];
    }
    currentSize--;
    }
    }
   
    private int findLocationDelete(int item) {
    for (int i = 0; i < currentSize; i++) {
    if (array[i] == item) {
    return i;
    }
    }
    return -1;
    }
   
    public void printArray() {
    System.out.print("The elements of the array: ");
    for (int i = 0; i < currentSize; i++) {
    System.out.print(array[i] + " ");
    }
    System.out.println();
    }
   
   }