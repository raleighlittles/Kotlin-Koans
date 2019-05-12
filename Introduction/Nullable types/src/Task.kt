fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){

/* The 3 big takeaways here are : smart casting, the elvis operator, and safe calls.

 * The elvis operator is essentially a shorter version of the traditional ternary operator,
 * and is denoted by "?:". It returns the first operand if it evaluates to true, otherwise it
 * evaluates and returns the second operand. Here it's used to check whether client.personalInfo is null,
 * and if so, it returns.
 *
 * Safe calls are a Kotlin feature whereby prefixing a "?" before the member access variable means that the compiler
 * will check if the object is null before trying to access the member. i.e. if you do b?.length, it will only return
 * the length if b is not null, otherwise it will return null.
 *
 * I still don't quite grasp the full extent of smart casts, but in this context, it seems like it essentially unwraps
 * the Optional type trait after we've checked added a null check. That is, the compiler sees we had an Optional type trait (?),
 * did a null check on it, then the Optional type is unwrapped away. Here specifically `email` and `message` were smart
 * casted from String? to String after doing a null check, so that they could be used with the sendMessage() function.
 *
 * */
    val personalInfo : PersonalInfo = client?.personalInfo ?: return

    val email : String? = personalInfo.email

    if (email != null && message != null)
    {
        mailer.sendMessage(email, message)
    }

}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
