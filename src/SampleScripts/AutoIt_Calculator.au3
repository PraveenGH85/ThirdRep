Run("C:\Windows\System32\calc.exe", "", @SW_SHOWMAXIMIZED)
WinWaitActive("Calculator")
Sleep(2000)
Send("30")
Sleep(2000)
Send("{+}")
Sleep(2000)
Send("20")
Sleep(2000)
Send("{ENTER}")
Sleep(6000)
WinClose("Calculator")