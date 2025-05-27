
package CRUD;

public class CRUD_Test {
    public static void main(String[] args) {
        CRUD_Test obj = new CRUD_Test();
        obj.create_data("1", "Alice", "alice@gmail.com");
    }

    public void create_data(String sl_no, String name, String email) {
        System.out.println("Simulating insert: " + sl_no + ", " + name + ", " + email);
    }
}
