// @GENERATOR:play-routes-compiler
// @SOURCE:/home/david/Applications/hmrc-development-environment/hmrc/digital-rooms/conf/routes
// @DATE:Thu Mar 29 13:43:53 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
