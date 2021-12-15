package tools.dynamia.zk.addons.chartjs;

public class Scales extends LazyJSONObject {

    public Scales() {
    }

    public Scales(Axe xAxe, Axe yAxe) {
    	add("x", xAxe);
        add("y", yAxe);
    }

    public Scales add(String id, Axe axe) {
        put(id, axe);
        return this;
    }

    @Override
    public void init() {
        if (!isEmpty()) {
            for (Object axe : values()){
                ((Axe)axe).init();
            }
        }
    }

    public Axe getAxe(String id) {
    	return (Axe) get(id);
    }
}
