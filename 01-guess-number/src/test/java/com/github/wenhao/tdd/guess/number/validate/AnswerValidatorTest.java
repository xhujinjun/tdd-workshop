package com.github.wenhao.tdd.guess.number.validate;

import com.github.wenhao.tdd.guess.number.domain.Answer;
import com.github.wenhao.tdd.guess.number.exception.AnswerNumberDuplicatedException;
import com.github.wenhao.tdd.guess.number.exception.AnswerNotFourDigitException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AnswerValidatorTest
{

    private AnswerValidator answerValidator;

    @Before
    public void setUp() throws Exception
    {
        answerValidator = new AnswerValidator();
    }

    @Test
    public void should_be_able_to_validate_answer() throws Exception
    {
        // given
        Answer answer = Answer.createAnswer("1 2 3 4");

        // when
        Boolean isValid = answerValidator.validate(answer);

        // then
        assertThat(isValid, is(true));
    }

    @Test(expected = AnswerNotFourDigitException.class)
    public void should_raise_error_out_of_range_answer_exception_which_is_not_between_0_and_9() throws Exception
    {
        // given
        Answer answer = Answer.createAnswer("1 2 3 11");

        // when
        answerValidator.validate(answer);
    }

    @Test(expected = AnswerNotFourDigitException.class)
    public void should_raise_error_which_size_is_not_4() throws Exception
    {
        // given
        Answer answer = Answer.createAnswer("1 2");

        // when
        answerValidator.validate(answer);
    }

    @Test(expected = AnswerNumberDuplicatedException.class)
    public void should_raise_error_which_contains_duplication() throws Exception
    {
        // given
        Answer answer = Answer.createAnswer("1 2 2 3");

        // when
        answerValidator.validate(answer);
    }
}
