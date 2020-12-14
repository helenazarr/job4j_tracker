package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenMultiValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected;
        int len = ((StubInput)in).getAnswers().length;
        Integer[] selectedList = new Integer[len];
        for(int i = 0; i < len; i++){
            selected = input.askInt("Enter menu:");
            selectedList[i] = selected;
        }
        Integer[] expected = new Integer[] {2, 3};
        assertThat(selectedList, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
    }

}