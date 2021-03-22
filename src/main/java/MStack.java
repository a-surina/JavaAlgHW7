import java.util.ArrayList;
import java.util.Collection;

public class MStack {
    private final ArrayList<Integer> stack = new ArrayList<>();
    private int top = -1;

    public MStack() {
    }

    public void push(Integer el) {
        this.stack.add(el);
        this.top++;
    }

    public void pushSeveral(Collection<Integer> el) {
        for (Integer e : el) {
            this.push(e);
        }
    }

    public void pop() {
        System.out.println(this.peek());
        this.stack.remove(this.top);
        this.top--;
    }

    public int peek() {
        if (this.top != -1) {
            return this.stack.get(this.top);
        }
        return -1;
    }

    public boolean empty() {
        return (this.top == -1);
    }
}
