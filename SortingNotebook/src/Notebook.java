import java.util.Arrays;

public class Notebook implements Comparable<Notebook> {
    private Integer price;
    private Integer memory;
    private String name;


    public Notebook(Integer price, Integer memory, String name) {
        this.price = price;
        this.memory = memory;
        this.name = name;
    }

    public Integer nameInd() {
        return Arrays.asList(NoteBookManufacturer.names).indexOf(this.name);
    }



    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Notebook o) {
        int result;
        result = Integer.compare(price, o.price);
        if (result != 0) return result;
        result = Integer.compare(memory, o.memory);
        if (result != 0) return result;
        Integer nameInd = Arrays.asList(NoteBookManufacturer.names).indexOf(o.name);
        result = Integer.compare(this.nameInd(), nameInd);
        if (result != 0) return result;
        return result;

    }
}
