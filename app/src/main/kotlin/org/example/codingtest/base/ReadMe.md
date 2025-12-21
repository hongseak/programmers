#### [파일 및 코드 템플릿을 만들어 둠]
```text
적용 방법
> 설정 (win : Ctrl + Alt + s / mac : command + ,)
> Editor > File and Code Templates 
```

```kotlin notebook
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger.Companion.getRunTime

class ${NAME} : BaseAnswer() {
    override fun solution() {
        
    }
}

fun main() {
    getRunTime {
        val a = ${NAME}()
        a.solution()
    }
}
```
