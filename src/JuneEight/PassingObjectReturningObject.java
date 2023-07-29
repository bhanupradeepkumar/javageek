package JuneEight;

public class PassingObjectReturningObject {
    public static void main(String[] args) {
        Lemon l1 = new Lemon();
        l1.setColor("yellow");
        l1.setCost(2);
        l1.setQuantity(10);
        l1.setSize("circular");
        l1.setTaste("sour");

        Water w1 = new Water();
        w1.setColor("transparent");
        w1.setPrice(20);
        w1.setType("kinley");
        w1.setQuantity(4);

        Sugar s1 = new Sugar();
        s1.setCost(25);
        s1.setQuantity(2);
        s1.setType("Organic");
        s1.setTaste("sweet");

        Kitchen kitchen = new Kitchen();
        LemonJuice theJuice = kitchen.makeASoftDrink(l1,w1,s1);
        System.out.println("get quantity :"+theJuice.getQuantity());
        System.out.println("get taste :"+theJuice.getTaste());
        System.out.println("______________");

        Teabag teabag = new Teabag();
        teabag.setBrand("tata");
        teabag.setTaste("ginger");
        teabag.setQty(1);

        LemonTea theTea = kitchen.makeTea(l1,w1,s1,teabag);
        System.out.println("get quantity :"+theTea.getQuantity());
        System.out.println("get taste :"+theTea.getTaste());
        System.out.println("_______");

        Milk m1 = new Milk();
        m1.setColour("white");
        m1.setQty(2);
        m1.setType("sangam");

        Tea tea = kitchen.makeTea(m1,w1,s1,teabag);
        System.out.println("get qty :"+tea.getQuantity());
        System.out.println("tea taste :"+s1.getTaste()+","+teabag.getTaste());



    }
}

class Kitchen{

    LemonJuice makeASoftDrink(Lemon x,Water y,Sugar z){
        System.out.println("making a soft drink...");
        //internal for taste x.getTaste y.getTaste and z.Quantity like that
        LemonJuice juice = new LemonJuice();
        juice.setQuantity(y.getQuantity());
        juice.setTaste(x.taste+","+z.getTaste());
        return juice; //return the object of lemon juice type

    }
    LemonTea makeTea(Lemon lemon,Water water,Sugar sugar,Teabag teabag){
        System.out.println("making a lemon tea");
        LemonTea lemonTea = new LemonTea();
        lemonTea.setQuantity(water.getQuantity());
        lemonTea.setTaste(lemon.getTaste()+","+teabag.getTaste());
        lemonTea.setSourlevel(5);
        lemonTea.setSourlevel(8);
        return lemonTea;
    }

    Tea makeTea(Milk milk,Water water,Sugar sugar,Teabag teabag){
        System.out.println("making a tea...");
        Tea tea = new Tea();
        tea.setQuantity(water.getQuantity());
        tea.setTaste(teabag.getTaste());
        return tea;
    }

}

class Juice{

}

class LemonJuice extends Juice{
int quantity;
String taste;
public int getQuantity(){
    return quantity;
}
public void setQuantity(int quantity){
    this.quantity=quantity;
}
public String getTaste(){
    return taste;
}
public void setTaste(String taste){
    this.taste=taste;
}
}

class Tea{
int quantity;
String taste;
public int getQuantity(){
    return quantity;
}
public void setQuantity(int quantity){
    this.quantity=quantity;
}

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}

class LemonTea extends Tea{
    private int sourlevel;
    private int sweetlevel;


    public int getSourlevel() {
        return sourlevel;
    }

    public void setSourlevel(int sourlevel) {
        this.sourlevel = sourlevel;
    }

    public int getSweetlevel() {
        return sweetlevel;
    }

    public void setSweetlevel(int sweetlevel) {
        this.sweetlevel = sweetlevel;
    }



}




class Milk{
    int qty;
    String type;
    String colour;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

class Teabag{
    String brand;
    String taste;
    int qty;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getTaste(){
        return taste;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
}

class Lemon{
    String color;
    String size;
    int cost;
    int quantity;
    String taste;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}

class Water{
    String type; //mineral | tap | filter
    int quantity;
    String color;
    int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Sugar{
    String type;
    int quantity;
    int cost;
    String taste;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}