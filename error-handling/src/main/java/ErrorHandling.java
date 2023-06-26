import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IOException {
        throw new IOException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws FileNotFoundException {
        throw new FileNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        // Delete this statement and write your own implementation.
        throw new NullPointerException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new RuntimeException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            int value = Integer.parseInt(integer);
            return Optional.of(value);
        } catch (NumberFormatException e) {
             return Optional.empty();
        }
    }

}
