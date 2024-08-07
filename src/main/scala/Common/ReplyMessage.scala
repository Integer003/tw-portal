package Common

/** 一个general 的reply message，包含了状态与信息和uuid。
  * status默认是0，即是正常的回复。
  * uuid默认是空，是因为我们希望uuid都是系统自动填写的，不需要人手工填写 */
case class ReplyMessage(status:Int, info: String, var uuid:String="")