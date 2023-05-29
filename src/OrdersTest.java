import java.util.ArrayList;
    class Order{
        public String name;
        public double total;
        public boolean ready;
        public ArrayList<Item> items = new ArrayList<Item>();
    }

    class Item{
        public String name;
        public double price;
    }
