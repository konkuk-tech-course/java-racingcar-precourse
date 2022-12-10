package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.constant.InputPhrase;
import racingcar.view.constant.InputProperties;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private static class InstanceHolder {
        private static final InputView INSTANCE = new InputView();
    }

    public static InputView getInstance() {
        return InputView.InstanceHolder.INSTANCE;
    }

    public List<String> readNames() {
        System.out.println(InputPhrase.NAMES.get());
        String input = Console.readLine().trim();
        List<String> parsedInput = parseNamesInput(input);
        parsedInput.forEach(ViewValidator::validateName);
        return parsedInput;
    }

    private List<String> parseNamesInput(String input) {
        return Arrays.stream(input.split(InputProperties.DELIMITER.get()))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public int readTryCount() {
        System.out.println(InputPhrase.TRY.get());
        String input = Console.readLine().trim();
        ViewValidator.validateTryCount(input);
        return Integer.parseInt(input);
    }
}
