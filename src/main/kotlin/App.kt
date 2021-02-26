import java.io.File

fun main(args: Array<String>) = Identity.main(args)

fun createArchiveIfNotExists() {
  if (!File("Identities.zip").exists()) {

  }
}