package seedu.flashcard.model.flashcard;

import java.util.Set;

import seedu.flashcard.model.tag.Tag;

/**
 * Short Answer MCQ flashcard. Does not contain any choices.
 */
public class ShortAnswerFlashcard extends Flashcard {

    /**
     * This initializer is used when the user is creating a new flashcard
     */
    public ShortAnswerFlashcard(Question question, Definition definitions, Set<Tag> tags, Answer answer) {
        super(question, definitions, tags, answer);
    }

    /**
     * This initializer should only be accessed by the storage package, because this initializer ensures the
     * flashcard scores can be reloaded
     */
    public ShortAnswerFlashcard(Question question, Definition definition, Set<Tag> tags, Answer answer, Score score) {
        super(question, definition, tags, answer, score);
    }

    @Override
    public boolean isMcq() {
        return false;
    }
}