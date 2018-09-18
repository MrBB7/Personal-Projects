package balazs.bence.todoapplication

import android.app.Application
import io.realm.Realm

open class TodoList : Application() {
    public override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}