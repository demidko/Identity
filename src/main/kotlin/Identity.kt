import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import java.io.File

object Identity : CliktCommand("The crypto-identities based accounts manager. Specify name to create new identity folder.") {

  private val name by argument()

  override fun run() {
    File(name).apply {
      mkdir()
      File("$this/README.md").writeText("## $name\n")
      File("$this/.identity").createNewFile()
    }
    echo("New identity folder $name created. You can add text and images. To save changes use 'idt push' command")
  }
}