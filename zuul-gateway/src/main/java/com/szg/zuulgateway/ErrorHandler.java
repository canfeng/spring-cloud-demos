package com.szg.zuulgateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * created by shizhiguo at 2019/6/12 14:41
 */
@Slf4j
@RestController
public class ErrorHandler {

    private class ErrorBean {
        private String message;

        private String reason;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    @GetMapping("/error")
    public ResponseEntity<ErrorBean> error(HttpServletRequest request) {
        String message = request.getAttribute("javax.servlet.error.message").toString();
        ErrorBean errorBean = new ErrorBean();
        errorBean.setMessage(message);
        errorBean.setReason("程序出错");
        return new ResponseEntity<>(errorBean, HttpStatus.BAD_GATEWAY);
    }
}
