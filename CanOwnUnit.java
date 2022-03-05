package Model.ownership;

// Может владеть юнитом
public interface CanOwnUnit {

    Unit getUnit();
    boolean isEmpty(); //empty

    boolean putUnit(Unit init);
    Unit extractUnit();
}
