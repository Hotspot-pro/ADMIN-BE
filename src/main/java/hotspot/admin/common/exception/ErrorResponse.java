package hotspot.admin.common.exception;

public record ErrorResponse(int statusCode, String code, String message) {}
