public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("A", "Two blacks are walking, one has a dollar in his hands, the other has 98 cents, and suddenly they see: in front of them is an office on which it is written \"we will make you white for just 99 cents.\"");
        myHashMap.put("B", "Well, the one with the dollar says \"let me come in now, and when I come out I’ll give you a cent so that you can come in too and become white.\"");
        myHashMap.put("C", "Well, he went and after a while a handsome white blond with blue eyes came out, the second one said: \"Okay, that’s it, give me one cent.\"");
        myHashMap.put("D", "-get a job nigga");
        System.out.println(myHashMap.get("A"));
        System.out.println(myHashMap.get("B"));
        System.out.println(myHashMap.get("C"));
        System.out.println(myHashMap.get("D"));
        myHashMap.remove("A");
        myHashMap.remove("B");
        myHashMap.remove("C");
        myHashMap.remove("D");
        myHashMap.put("E", "ИЗВИНИТЕ МЕНЯ ПОЖАЛУЙСТА Я БОЛЬШЕ ТАК НЕ БУДУ!!!");
        System.out.println(myHashMap.get("E"));
        System.out.println(myHashMap.get("E"));
        System.out.println(myHashMap.get("E"));
    }
}