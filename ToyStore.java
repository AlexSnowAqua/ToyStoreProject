import java.util.PriorityQueue;

public class ToyStore {
    private String[] toyIds;
    private String[] toyNames;
    private int[] toyWeights;
    private PriorityQueue<Toy> toyQueue;

    public ToyStore(String[] ids, String[] names, int[] weights) {
        this.toyIds = ids;
        this.toyNames = names;
        this.toyWeights = weights;
        this.toyQueue = new PriorityQueue<>((t1, t2) -> t2.getWeight() - t1.getWeight());

        for (int i = 0; i < ids.length; i++) {
            Toy toy = new Toy(ids[i], names[i], weights[i]);
            toyQueue.add(toy);
        }
    }

    public Toy getToy() {
        return toyQueue.poll();
    }
}

