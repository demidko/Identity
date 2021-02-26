## Identity

The crypto-identities based accounts manager.

### Delete

Just delete folder with

### Usage

If this is your first time using `Identity`, archive `Identities.zip` will
be created, and you will be prompted for a master password.

* `./idt [IDENTITY NAME]` to create new identity folder. You can save text, images and other files.
* `./idt push [MASTER PASSWORD]` to save all changed identities.
* `./idt pull [MASTER PASSWORD]` to unpack all identities in a current folder.

### Build with [`Gradle`](https://gradle.org/)

* Execute command `gradle clean test runtime` to build self-executable jar.

Then you can start the application with the `./build/image/bin/idt` command.
