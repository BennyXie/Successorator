package edu.ucsd.cse110.successorator.lib.domain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

public class DatedGoal extends Goal {
    private Date date;

    public DatedGoal(
        @NonNull Integer id,
        @NonNull String content,
        @NonNull boolean isComplete,
        @Nullable int sortOrder,
        @NonNull Context context,
        @NonNull Date date
    ) {
        super(id, content, isComplete, sortOrder, context);
        this.date = date;
    }
    public DatedGoal(
            @NonNull Integer id,
            @NonNull String content,
            @NonNull boolean isComplete,
            @Nullable int sortOrder,
            @NonNull Date date
    ) {
        super(id, content, isComplete, sortOrder);
        this.date = date;
    }
    public DatedGoal(@NonNull Goal goal,
                       Date date) {
        super(goal.getId(), goal.getContent(), goal.isComplete(), goal.getSortOrder());
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatedGoal goal = (DatedGoal) o;
        return this.isComplete() == goal.isComplete() &&
                this.getSortOrder() == goal.getSortOrder() && Objects.equals(this.id(), goal.id()) &&
                Objects.equals(this.getContent(), goal.getContent())
                && Objects.equals(this.getContext(), goal.getContext()) &&
                Objects.equals(this.getDate(), goal.getDate());

    }
}
