public class Pen{
    private final IType IType;
    private final InkType InkType;
    private final IVarity IVarity;

    public Pen(IType IType, InkType InkType, IVarity IVarity){
        this.IType = IType;
        this.InkType = InkType;
        this.IVarity = IVarity;
    }

    public void start(){
        IType.start();
    }

    public void close(){
        IType.close();
    }

    public void write(String s){
        IVarity.write(s);
    }

    public void refill(){
        InkType.refill();
        IVarity.refill();
    }
}
