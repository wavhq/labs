package ru.mirea.lab18;

public class Matrix<T> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        T[][] resultData = (T[][]) new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = (T) add(data[i][j], other.get(i, j));
            }
        }

        return new Matrix<>(resultData);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction");
        }

        T[][] resultData = (T[][]) new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = (T) subtract(data[i][j], other.get(i, j));
            }
        }

        return new Matrix<>(resultData);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.getRows()) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }

        T[][] resultData = (T[][]) new Object[rows][other.getCols()];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                T sum = (T) zero();
                for (int k = 0; k < cols; k++) {
                    sum = (T) add(sum, multiply(data[i][k], other.get(k, j)));
                }
                resultData[i][j] = sum;
            }
        }

        return new Matrix<>(resultData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a + (Double) b);
        }
        // Добавьте другие типы данных по мере необходимости
        throw new IllegalArgumentException("Unsupported data type for addition");
    }

    private T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a - (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a - (Double) b);
        }
        // Добавьте другие типы данных по мере необходимости
        throw new IllegalArgumentException("Unsupported data type for subtraction");
    }

    private T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a * (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a * (Double) b);
        }
        // Добавьте другие типы данных по мере необходимости
        throw new IllegalArgumentException("Unsupported data type for multiplication");
    }

    private T zero() {
        if (data[0][0] instanceof Integer) {
            return (T) (Object) 0;
        } else if (data[0][0] instanceof Double) {
            return (T) (Object) 0.0;
        }
        // Добавьте другие типы данных по мере необходимости
        throw new IllegalArgumentException("Unsupported data type for zero value");
    }

    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{5, 6}, {7, 8}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        Matrix<Integer> sumResult = matrix1.add(matrix2);
        Matrix<Integer> subResult = matrix1.subtract(matrix2);
        Matrix<Integer> mulResult = matrix1.multiply(matrix2);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        System.out.println("Sum Result:");
        System.out.println(sumResult);

        System.out.println("Subtraction Result:");
        System.out.println(subResult);

        System.out.println("Multiplication Result:");
        System.out.println(mulResult);
    }
}
