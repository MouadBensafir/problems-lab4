package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int array_size;
    int numOfElements;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
        array_size = size;
        numOfElements = 0;
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        numOfElements = list.length;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        int[] newList = new int[2*array_size];

        // Copy the original values
        for (int i=0; i<array_size; i++)
            newList[i] = list[i];

        list = newList;
        array_size *= 2;
    }

    public void addElement(int newVal) {
        if (numOfElements == array_size) {
            increaseSize();
        }
        list[numOfElements] = newVal;
        numOfElements++;
    }

    public void removeElement(int newVal) {
        // Find the indice of the first occurence
        int indice = -1;
        for (int i=0; i<numOfElements; i++) {
            if (list[i] == newVal) {
                indice = i;
            }
        }
        for (int j=indice; j<numOfElements; j++) {
            list[j] = list[j+1];
        }

        // If the indice remains unchanged, no element was deleted
        if (indice != -1) numOfElements--;
    }

}