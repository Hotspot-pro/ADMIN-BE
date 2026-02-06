package hotspot.admin.common.exception;

import hotspot.admin.common.exception.code.BaseErrorCode;

public class ApplicationException extends BaseException {

    public ApplicationException(BaseErrorCode code) {
        super(code);
    }
}
