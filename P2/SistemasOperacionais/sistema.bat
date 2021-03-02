@echo off
cls

:menu
echo Sistema de teste
echo ---------------------------
echo   Menu Principal
echo ---------------------------
echo  1 - Opcao 1
echo  2 - Opcao 2
echo  3 - Opcao 3
echo  4 - Opcao 4
echo  0 - SAIR
echo ---------------------------
set /p Comando= Digite uma Opcao: 
if "%Comando%" equ "1" (goto:op1)
if "%Comando%" equ "2" (goto:op2)
if "%Comando%" equ "3" (goto:op3)
if "%Comando%" equ "4" (goto:op4)
if "%Comando%" equ "0" (goto:exit)

:op1
echo Opcao 1
echo ...
echo Pois e, essa opcao nao faz muita coisa...
pause
goto:menu

:op2
set /p user=Nome de usuario: 
set data=%DATE%
set hora=%TIME%
echo Nome de usuario:%user%    Data:%data%    Hora:%hora%>>historico.txt
echo historico.txt atualizado com sucesso!
pause
goto:menu

:op3
echo Voce se encontra com um grande botao vermelho na sua frente, voce o aperta?
set /p Escolha= Sim ou Nao? 
if "%Escolha%" equ "Sim" (goto:op3_1)
if "%Escolha%" equ "Nao" (goto:op3_2)

:op3_1
echo Ok, eliminando Sys32 em 3... 2... 1...
echo Calma estou brincando
echo Eu nao sei fazer esse tipo de coisa ainda
echo ...
echo ainda.
pause
goto:menu


:op3_2
echo Melhor nao apertar grandes botoes vermelhos sem saber o que eles fazem...
pause
goto:menu

:op4
echo Voce escolheu errado.
pause
start "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
pause
goto:menu

:exit
echo Tchau!
pause
exit