package com.example.kevinwong.geoquiz;

/**
 * Created by kevinwong on 2016-07-13.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion)
    {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion()
    {
        return mQuestion;
    }

    public void setQuestion(int question)
    {
        mQuestion = question;
    }

    public boolean ismTrueQuestion()
    {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion)
    {
        mTrueQuestion = trueQuestion;
    }
}
