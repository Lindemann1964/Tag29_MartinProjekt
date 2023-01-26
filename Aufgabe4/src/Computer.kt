class Computer(){
    var isOn:Boolean =false
    fun pressOnButton() {
        if (!isOn){
            isOn=true
        }
    }
    fun pressOffButton(){
        if (isOn){
            isOn=false
        }


    }
    fun sendEMail(){
        if (isOn){
            println("EMailsend")
        }else {
            println("Nachricht kann nicht gesendet werden")
        }

    }

}