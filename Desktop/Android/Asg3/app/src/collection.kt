//mutable
The word mutable means being liable to change.
        The differnce between list and array is in how they are used for example if non mutable lists
        is used it means that the list is not to be changed where else for arrays can be changed but
        when necessary but the length and size cannot change.
         for example
var register =listof<string>("john","joy","steve","samantha")
register.get(0)
       or
register[0]
var openOrClose = arrayOf("open","close")
openOrClose.set(0,close)
       or
openOrClose[0] ="close"

        for mutable list and arrays they one can add and remove elements from a list
             for example
        var list = mutablelistof<string>("brian","isaac","janice","monica")
list.add("adrien")
        list.remove("brian")
        var list = arraylistof<String>("jam","butter","bread")
    list.add(0,"peanut")
        list.remove("bread")