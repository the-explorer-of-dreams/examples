import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class HelloWorld {
    String itemId;
    String name;
    String code;

    public static void main(String[] args){
        HelloWorld helloWorld =  new HelloWorld();
        helloWorld.itemId = "001";
        helloWorld.name = "威廉";
        helloWorld.code = "william";
        printContent("hello");
        LinkedList<String> linkedList =  new LinkedList<String>();
        linkedList.add("how");
        linkedList.add("are");
        linkedList.add("you");
        linkedList.add("?");
        Collections.sort(linkedList);
        for (String str : linkedList) {
            printContent(str);
        }

        System.out.println("itemId="+helloWorld.itemId+",code="+helloWorld.code+",name="+helloWorld.name);

    }

    public static void printContent(String str){
        System.out.print(str+" ");
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
