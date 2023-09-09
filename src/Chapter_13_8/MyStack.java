package Chapter_13_8;

import java.util.ArrayList;
class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        int count = 0;
        for (Object o : list) {
            count++;
        }
        return count;
    }

    public Object peek() {
        return getElementByIndex(0);
    }

    public Object getElementByIndex(int index) {
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                return arr[i];
            }
        }
        return null;
    }

    public Object pop() {
        return getElementByIndex(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
