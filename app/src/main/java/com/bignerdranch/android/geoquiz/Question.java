package com.bignerdranch.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAlreadyAnswered;

    public Question(int textResId, boolean answerTrue, boolean alreadyAnswered){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAlreadyAnswered = alreadyAnswered;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAlreadyAnswered() {
        return mAlreadyAnswered;
    }

    public void setAlreadyAnswered(boolean alreadyAnswered) {
        mAlreadyAnswered = alreadyAnswered;
    }
}
