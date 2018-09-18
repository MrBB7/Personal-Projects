package balazs.bence.todoapplication

import io.realm.Realm
import io.realm.RealmObject

public class Dog : RealmObject() {
    public var name = ""
    public var age = 0
}