package Model.ownership;

// Может владеть юнитом
public interface CanOwnUnit {

    Unit getUnit();
    boolean isEmpty();
 //hello
    boolean putUnit(Unit init);
    Unit extractUnit();
}
