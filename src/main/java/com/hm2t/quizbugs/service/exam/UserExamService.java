package com.hm2t.quizbugs.service.exam;

import com.hm2t.quizbugs.model.exam.UserExam;
import com.hm2t.quizbugs.model.users.AppUser;
import com.hm2t.quizbugs.service.IService;

public interface UserExamService extends IService<UserExam> {
    Iterable<UserExam> findAllByUser(AppUser user);
}
