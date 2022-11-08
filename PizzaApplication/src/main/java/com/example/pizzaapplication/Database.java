package com.example.pizzaapplication;
import java.util.ArrayList;

public class Database {
    private ArrayList<String> ASUId;
    private ArrayList<String> AgentId;
    private ArrayList<String> ChefId;
    private ArrayList<String> OrderNumber;
//    private ArrayList<Student> order;

    public Database(){
        ASUId = new ArrayList<String>();
        AgentId = new ArrayList<String>();
        ChefId = new ArrayList<String>();
        OrderNumber = new ArrayList<String>();
//        order = new ArrayList<Student>();
        ASUId.add("ASU000");
        AgentId.add("AGENT000");
        ChefId.add("CHEF000");
        generateId(this.ASUId, this.AgentId, this.ChefId);
    }

    public void generateId(ArrayList<String> ASUId, ArrayList<String> AgentId, ArrayList<String> ChefId){
        OrderNumber.add("1234");
        for(int i = 1; i < 100; i++){
            ASUId.add("ASU" + randNumber());
            if (i < 10) {
                AgentId.add("AGENT" + randNumber());
                ChefId.add("CHEF" + randNumber());
            }
        }
    }

    public boolean searchId(String id, String indentifier){
        if(indentifier.toLowerCase().equals("student")){
            return ASUId.contains(id);
        }
        else if(indentifier.toLowerCase().equals("agent")){
            return AgentId.contains(id);
        }
        else if(indentifier.toLowerCase().equals("chef")){
            return ChefId.contains(id);
        }
        return false;
    }

    //serach order number
//    public boolean searchOrderNumber(String orderNumber){
//        for(int i = 0; i < order.size(); i++){
//            if(order.get(i).getOrderNumber().equals(orderNumber)){
//                return true;
//            }
//        }
//        return false;
//    }

    public String randNumber(){
        return "" + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10);
    }

    public void printId(){
        for(int i = 0; i < AgentId.size(); i++){
            System.out.println(AgentId.get(i));
        }
    }

//    public void addOrder(Student student){
//        order.add(student);
//    }
//
//    public void printOrder(){
//        for(Student student : order){
//            System.out.println(student.getId() + " " + student.getPizzaType());
//        }
//    }

//    public void updateStatus(String id){
//        for(Student student : order){
//            if(student.getId().equals(id)){
//                student.setOrderStatus("Cooking");
//            }
//        }
//        return null;
//    }

//    public String printStatus(String ordernumber){
//        for(Student student : order){
//            if(student.getId().equals(ordernumber)){
//                return student.getOrderStatus();
//            }
//        }
//        return null;
//    }

    //get ordernumber
//    public String printOrderNumber(String ordernumber){
//        for(Student student : order){
//            if(student.getOrderNumber().equals(ordernumber)){
//                return student.getOrderNumber();
//            }
//        }
//        return null;
//    }
}