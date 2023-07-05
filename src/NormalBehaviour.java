public class NormalBehaviour implements IBehaviour
{

    @Override
    public int moveCommand() {
        System.out.println("comportement normal: patrouiller entre un arrayList de points (ArrayLyst<Points>) ");
        return 0;
    }
}
