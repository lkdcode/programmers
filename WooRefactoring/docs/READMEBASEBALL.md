## π―BaseBall

μλ£ - β
ββββββββββ [β] <View> κ²μ μμ λ©μμ§ μΆλ ₯ [OutputView#printStart]
βββββββ¬βββ [ ] <Model> μ»΄ν¨ν° μ«μ μμ± [BaseBall#computer]
β.....ββββ [ ] <Model> 3μλ¦¬μ μΈκ°? [Validate#validateLength]
β.....ββββ [ ] <Model> μ«μλ§ μ‘΄μ¬νλκ°? [Validate#validateNumber]
β.....ββββ [ ] <Model> 0μ΄ ν¬ν¨λμ΄μλκ°? [Validate#validateZero]
β.....ββββ [ ] <Model> μ€λ³΅λ μ«μκ° μλκ°? [Validate#validateDuplication]
β
ββββββββββ [β] <View> "μ«μλ₯Ό μλ ₯ν΄μ£ΌμΈμ." [OutputView#printInput]
β
βββββββ¬βββ [ ] <Controller> μ«μλ₯Ό μλ ₯λ°λ λ©μλ [InputView#readNumber]
β.....ββββ [ ] <Controller> 3μλ¦¬μ μΈκ°? [Validate#validateLength]
β.....ββββ [ ] <Controller> μ«μλ§ μ‘΄μ¬νλκ°? [Validate#validateNumber]
β.....ββββ [ ] <Controller> 0μ΄ ν¬ν¨λμ΄μλκ°? [Validate#validateZero]
β.....ββββ [ ] <Controller> μ€λ³΅λ μ«μκ° μλκ°? [Validate#validateDuplication]
β
ββββββββββ [ ] <Model> μ»¨νΈλ‘€λ¬λ‘λΆν° μ μ μ λ²νΈμ λ²νΈ λ°κΈ° [BaseBall#user]
ββββββββββ [ ] <Model> μ»΄ν¨ν° μ«μμ μ μ μ μ«μλ₯Ό λΉκ΅ [BaseBall#playBaseBall]
β
βββββββ¬βββ [ ] <Controller> λͺ¨λΈλ‘λΆν° κ²°κ³Όκ° λ°κΈ°
......ββββ [β] <View> κ²°κ³Όκ° μΆλ ₯ [OutputView#printResult]
......ββββ [β] <View> μΉλ¦¬ λ©μμ§ μΆλ ₯ [OutputView#printWin]
......ββββ [β] <View> μ¬μμ, μ’λ£ μΆλ ₯ [OutputView#printCommand]
......ββββ [ ] <Controller> μ¬μμ, μ’λ£ μλ ₯ λ°κΈ° [InputView#readCommand]
......ββββ [ ] <View> μμ  μ’λ£ λ©μμ§ μΆλ ₯ [OutputView#printQuit]

