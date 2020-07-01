package dao;

public class DaoException extends IllegalArgumentException {

    DaoException(String errorMessage) {
        super(errorMessage);
    }
}
