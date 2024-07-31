echo off
set arg1=%1

shift
shift
C:\Work\JDK17\bin\java --module-path %PATH_TO_FX% --add-modules javafx.controls %arg1%

rem C:\Work\JDK17\bin\java --module-path %PATH_TO_FX% --add-modules javafx.controls HelloFX
rem C:\Work\JDK17\bin\java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml HelloFX