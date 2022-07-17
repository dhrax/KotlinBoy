import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JFrame

class Window(title: String?) : JFrame(title), WindowListener {

    init {
        addWindowListener(this)
    }

    override fun windowOpened(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowClosing(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowClosed(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowIconified(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowDeiconified(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowActivated(e: WindowEvent?) {
        TODO("Not yet implemented")
    }

    override fun windowDeactivated(e: WindowEvent?) {
        TODO("Not yet implemented")
    }
}