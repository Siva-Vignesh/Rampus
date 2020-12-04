package com.sivavignesh.rampus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class cprogram extends AppCompatActivity {
    TextView title,code,output;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cprogram);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        title=(TextView)findViewById(R.id.ctitle);
        code=(TextView)findViewById(R.id.ccode);
        output=(TextView)findViewById(R.id.coutput);
        String value = getIntent().getStringExtra("variable");
        if(value.equals("c0")){
            title.setText("Addition of two number");
            code.setText("#include <stdio.h>\n" +
                    "#include <conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "int a, b, c;\n" +
                    "clrscr();\n" +
                    "printf (“Enter the Number : “);\n" +
                    "scanf (“%d%d”, &a, &b);\n" +
                    "c = a + b;\n" +
                    "printf (“\\n %d + %d = %d”, a,b,c);\n" +
                    "getch();\n" +
                    "}");
            output.setText("Enter two no: 5 6 \n" +
                    "5 + 6 = 11 ");
        }
        if(value.equals("c1")) {
            title.setText("Sum of N numbers");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int n, i, sum = 0;\n" +
                    "    \n" +
                    "    printf(\"Enter a positive integer: \");\n" +
                    "    scanf(\"%d\",&n);\n" +
                    "\n" +
                    "    for(i=1; i <= n; ++i)\n" +
                    "    {\n" +
                    "        sum += i;\n" +
                    "    }\n" +
                    "\n" +
                    "    printf(\"Sum = %d\",sum);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter a positive integer:100\n " +
            "Sum = 5050");
        }
        if(value.equals("c2")){
            title.setText("Odd or Even");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int number;\n" +
                    "\n" +
                    "    printf(\"Enter an integer: \");\n" +
                    "    scanf(\"%d\", &number);\n" +
                    "\n" +
                    "    // True if the number is perfectly divisible by 2\n" +
                    "    if(number % 2 == 0)\n" +
                    "        printf(\"%d is even.\", number);\n" +
                    "    else\n" +
                    "        printf(\"%d is odd.\", number);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter an integer: 7\n" +
                    "7 is odd.");
        }
        if(value.equals("c3")) {
            title.setText("factorial of a given number");
            code.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "   int num1,num2,num3;\n" +
                    "   printf(“nEnter value of num1, num2 and num3:“);\n" +
                    "   scanf(“%d %d %d“,&num1,&num2,&num3);\n" +
                    "   if((num1>num2)&&(num1>num3))\n" +
                    "      printf(“\n Number1 is greatest“);\n" +
                    "   else if((num2>num3)&&(num2>num1))\n" +
                    "      printf(“\n Number2 is greatest“);\n" +
                    "   else\n" +
                    "      printf(“\n Number3 is greatest“);\n" +
                    "   return 0;\n" +
                    "}");
            output.setText("Enter an integer: 10\n" +
                    "Factorial of 10 = 3628800");
        }
        if(value.equals("c4")) {
            title.setText("check if given number is prime or not");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int n, i, flag = 0;\n" +
                    "\n" +
                    "    printf(\"Enter a positive integer: \");\n" +
                    "    scanf(\"%d\", &n);\n" +
                    "\n" +
                    "    for(i = 2; i <= n/2; ++i)\n" +
                    "    {\n" +
                    "        // condition for nonprime number\n" +
                    "        if(n%i == 0)\n" +
                    "        {\n" +
                    "            flag = 1;\n" +
                    "            break;\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    if (n == 1) \n" +
                    "    {\n" +
                    "      printf(\"1 is neither a prime nor a composite number.\");\n" +
                    "    }\n" +
                    "    else \n" +
                    "    {\n" +
                    "        if (flag == 0)\n" +
                    "          printf(\"%d is a prime number.\", n);\n" +
                    "        else\n" +
                    "          printf(\"%d is not a prime number.\", n);\n" +
                    "    }\n" +
                    "    \n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter a positive integer: 29\n" +
                    "29 is a prime number.");
        }
        if(value.equals("c5")) {
            title.setText("Largest of three input numbers");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    double n1, n2, n3;\n" +
                    "\n" +
                    "    printf(\"Enter three different numbers: \");\n" +
                    "    scanf(\"%lf %lf %lf\", &n1, &n2, &n3);\n" +
                    "\n" +
                    "    if( n1>=n2 && n1>=n3 )\n" +
                    "        printf(\"%.2f is the largest number.\", n1);\n" +
                    "\n" +
                    "    if( n2>=n1 && n2>=n3 )\n" +
                    "        printf(\"%.2f is the largest number.\", n2);\n" +
                    "\n" +
                    "    if( n3>=n1 && n3>=n2 )\n" +
                    "        printf(\"%.2f is the largest number.\", n3);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter three numbers: -4.5\n" +
                    "3.9\n" +
                    "5.6\n" +
                    "5.60 is the largest number.");
        }
        if(value.equals("c6")) {
            title.setText("check if given number is Armstrong or not");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int number, originalNumber, remainder, result = 0;\n" +
                    "\n" +
                    "    printf(\"Enter a three digit integer: \");\n" +
                    "    scanf(\"%d\", &number);\n" +
                    "\n" +
                    "    originalNumber = number;\n" +
                    "\n" +
                    "    while (originalNumber != 0)\n" +
                    "    {\n" +
                    "        remainder = originalNumber%10;\n" +
                    "        result += remainder*remainder*remainder;\n" +
                    "        originalNumber /= 10;\n" +
                    "    }\n" +
                    "\n" +
                    "    if(result == number)\n" +
                    "        printf(\"%d is an Armstrong number.\",number);\n" +
                    "    else\n" +
                    "        printf(\"%d is not an Armstrong number.\",number);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter a three digit integer: 371\n" +
                    "371 is an Armstrong number. ");
        } if(value.equals("c7")) {
            title.setText("check if given number is palindrome or not");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int n, reversedInteger = 0, remainder, originalInteger;\n" +
                    "\n" +
                    "    printf(\"Enter an integer: \");\n" +
                    "    scanf(\"%d\", &n);\n" +
                    "\n" +
                    "    originalInteger = n;\n" +
                    "\n" +
                    "    // reversed integer is stored in variable \n" +
                    "    while( n!=0 )\n" +
                    "    {\n" +
                    "        remainder = n%10;\n" +
                    "        reversedInteger = reversedInteger*10 + remainder;\n" +
                    "        n /= 10;\n" +
                    "    }\n" +
                    "\n" +
                    "    // palindrome if orignalInteger and reversedInteger are equal\n" +
                    "    if (originalInteger == reversedInteger)\n" +
                    "        printf(\"%d is a palindrome.\", originalInteger);\n" +
                    "    else\n" +
                    "        printf(\"%d is not a palindrome.\", originalInteger);\n" +
                    "    \n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter an integer: 1001\n" +
                    "1001 is a palindrome.");
        } if(value.equals("c8")) {
            title.setText("Swapping Two Numbers");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "      double firstNumber, secondNumber, temporaryVariable;\n" +
                    "\n" +
                    "      printf(\"Enter first number: \");\n" +
                    "      scanf(\"%lf\", &firstNumber);\n" +
                    "\n" +
                    "      printf(\"Enter second number: \");\n" +
                    "      scanf(\"%lf\",&secondNumber);\n" +
                    "\n" +
                    "      // Value of firstNumber is assigned to temporaryVariable\n" +
                    "      temporaryVariable = firstNumber;\n" +
                    "\n" +
                    "      // Value of secondNumber is assigned to firstNumber\n" +
                    "      firstNumber = secondNumber;\n" +
                    "\n" +
                    "      // Value of temporaryVariable (which contains the initial value of firstNumber) is assigned to secondNumber\n" +
                    "      secondNumber = temporaryVariable;\n" +
                    "\n" +
                    "      printf(\"\\nAfter swapping, firstNumber = %.2lf\\n\", firstNumber);\n" +
                    "      printf(\"After swapping, secondNumber = %.2lf\", secondNumber);\n" +
                    "\n" +
                    "      return 0;\n" +
                    "}");
            output.setText("Enter first number: 1.20\n" +
                    "Enter second number: 2.45\n" +
                    "\n" +
                    "After swapping, firstNumber = 2.45\n" +
                    "After swapping, secondNumber = 1.20");
        }
        if(value.equals("c9")) {
            title.setText("Swapping Two Numbers without third variable");
            code.setText("#include <stdio.h> \n" +
                    "int main() \n" +
                    "{ \n" +
                    "  int x = 10, y = 5; \n" +
                    "  \n" +
                    "  // Code to swap 'x' and 'y' \n" +
                    "  x = x + y;  // x now becomes 15 \n" +
                    "  y = x - y;  // y becomes 10 \n" +
                    "  x = x - y;  // x becomes 5 \n" +
                    "  \n" +
                    "  printf(\"After Swapping: x = %d, y = %d\", x, y); \n" +
                    "  \n" +
                    "  return 0; \n" +
                    "} ");
            output.setText("After Swapping: x = 5, y = 10");
        }
        if(value.equals("c10")) {
            title.setText("Multiplication Table of any Number");
            code.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int n, i;\n" +
                    "\n" +
                    "    printf(\"Enter an integer: \");\n" +
                    "    scanf(\"%d\",&n);\n" +
                    "\n" +
                    "    for(i=1; i<=10; ++i)\n" +
                    "    {\n" +
                    "        printf(\"%d * %d = %d \\n\", n, i, n*i);\n" +
                    "    }\n" +
                    "    \n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter an integer: 9\n" +
                    "9 * 1 = 9\n" +
                    "9 * 2 = 18\n" +
                    "9 * 3 = 27\n" +
                    "9 * 4 = 36\n" +
                    "9 * 5 = 45\n" +
                    "9 * 6 = 54\n" +
                    "9 * 7 = 63\n" +
                    "9 * 8 = 72\n" +
                    "9 * 9 = 81\n" +
                    "9 * 10 = 90");
        }
        if(value.equals("c11")) {
            title.setText("addition and subtraction of Matrices");
            code.setText("#include <stdio.h>\n" +
                    "int main(){\n" +
                    "    int r, c, a[100][100], b[100][100], sum[100][100], i, j;\n" +
                    "\n" +
                    "    printf(\"Enter number of rows (between 1 and 100): \");\n" +
                    "    scanf(\"%d\", &r);\n" +
                    "    printf(\"Enter number of columns (between 1 and 100): \");\n" +
                    "    scanf(\"%d\", &c);\n" +
                    "\n" +
                    "    printf(\"\\nEnter elements of 1st matrix:\\n\");\n" +
                    "\n" +
                    "    for(i=0; i<r; ++i)\n" +
                    "        for(j=0; j<c; ++j)\n" +
                    "        {\n" +
                    "            printf(\"Enter element a%d%d: \",i+1,j+1);\n" +
                    "            scanf(\"%d\",&a[i][j]);\n" +
                    "        }\n" +
                    "\n" +
                    "    printf(\"Enter elements of 2nd matrix:\\n\");\n" +
                    "    for(i=0; i<r; ++i)\n" +
                    "        for(j=0; j<c; ++j)\n" +
                    "        {\n" +
                    "            printf(\"Enter element a%d%d: \",i+1, j+1);\n" +
                    "            scanf(\"%d\", &b[i][j]);\n" +
                    "        }\n" +
                    "\n" +
                    "    // Adding Two matrices\n" +
                    "\n" +
                    "    for(i=0;i<r;++i)\n" +
                    "        for(j=0;j<c;++j)\n" +
                    "        {\n" +
                    "            sum[i][j]=a[i][j]+b[i][j];\n" +
                    "        }\n" +
                    "\n" +
                    "    // Displaying the result\n" +
                    "    printf(\"\\nSum of two matrix is: \\n\\n\");\n" +
                    "\n" +
                    "    for(i=0;i<r;++i)\n" +
                    "        for(j=0;j<c;++j)\n" +
                    "        {\n" +
                    "\n" +
                    "            printf(\"%d   \",sum[i][j]);\n" +
                    "\n" +
                    "            if(j==c-1)\n" +
                    "            {\n" +
                    "                printf(\"\\n\\n\");\n" +
                    "            }\n" +
                    "        }\n" +
                    "    \n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter number of rows (between 1 and 100): 2\n" +
                    "Enter number of columns (between 1 and 100): 3\n" +
                    "\n" +
                    "Enter elements of 1st matrix:\n" +
                    "Enter element a11: 2\n" +
                    "Enter element a12: 3\n" +
                    "Enter element a13: 4\n" +
                    "Enter element a21: 5\n" +
                    "Enter element a22: 2\n" +
                    "Enter element a23: 3\n" +
                    "Enter elements of 2nd matrix:\n" +
                    "Enter element a11: -4\n" +
                    "Enter element a12: 5\n" +
                    "Enter element a13: 3\n" +
                    "Enter element a21: 5\n" +
                    "Enter element a22: 6\n" +
                    "Enter element a23: 3\n" +
                    "\n" +
                    "Sum of two matrix is: \n" +
                    "\n" +
                    "-2   8   7   \n" +
                    "\n" +
                    "10   8   6  ");
        }
        if(value.equals("c12")) {
            title.setText("Matrix Multiplication");
            code.setText("#include <stdio.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int a[10][10], b[10][10], result[10][10], r1, c1, r2, c2, i, j, k;\n" +
                    "\n" +
                    "    printf(\"Enter rows and column for first matrix: \");\n" +
                    "    scanf(\"%d %d\", &r1, &c1);\n" +
                    "\n" +
                    "    printf(\"Enter rows and column for second matrix: \");\n" +
                    "    scanf(\"%d %d\",&r2, &c2);\n" +
                    "\n" +
                    "    // Column of first matrix should be equal to column of second matrix and\n" +
                    "    while (c1 != r2)\n" +
                    "    {\n" +
                    "        printf(\"Error! column of first matrix not equal to row of second.\\n\\n\");\n" +
                    "        printf(\"Enter rows and column for first matrix: \");\n" +
                    "        scanf(\"%d %d\", &r1, &c1);\n" +
                    "        printf(\"Enter rows and column for second matrix: \");\n" +
                    "        scanf(\"%d %d\",&r2, &c2);\n" +
                    "    }\n" +
                    "\n" +
                    "    // Storing elements of first matrix.\n" +
                    "    printf(\"\\nEnter elements of matrix 1:\\n\");\n" +
                    "    for(i=0; i<r1; ++i)\n" +
                    "        for(j=0; j<c1; ++j)\n" +
                    "        {\n" +
                    "            printf(\"Enter elements a%d%d: \",i+1, j+1);\n" +
                    "            scanf(\"%d\", &a[i][j]);\n" +
                    "        }\n" +
                    "\n" +
                    "    // Storing elements of second matrix.\n" +
                    "    printf(\"\\nEnter elements of matrix 2:\\n\");\n" +
                    "    for(i=0; i<r2; ++i)\n" +
                    "        for(j=0; j<c2; ++j)\n" +
                    "        {\n" +
                    "            printf(\"Enter elements b%d%d: \",i+1, j+1);\n" +
                    "            scanf(\"%d\",&b[i][j]);\n" +
                    "        }\n" +
                    "\n" +
                    "    // Initializing all elements of result matrix to 0\n" +
                    "    for(i=0; i<r1; ++i)\n" +
                    "        for(j=0; j<c2; ++j)\n" +
                    "        {\n" +
                    "            result[i][j] = 0;\n" +
                    "        }\n" +
                    "\n" +
                    "    // Multiplying matrices a and b and\n" +
                    "    // storing result in result matrix\n" +
                    "    for(i=0; i<r1; ++i)\n" +
                    "        for(j=0; j<c2; ++j)\n" +
                    "            for(k=0; k<c1; ++k)\n" +
                    "            {\n" +
                    "                result[i][j]+=a[i][k]*b[k][j];\n" +
                    "            }\n" +
                    "\n" +
                    "    // Displaying the result\n" +
                    "    printf(\"\\nOutput Matrix:\\n\");\n" +
                    "    for(i=0; i<r1; ++i)\n" +
                    "        for(j=0; j<c2; ++j)\n" +
                    "        {\n" +
                    "            printf(\"%d  \", result[i][j]);\n" +
                    "            if(j == c2-1)\n" +
                    "                printf(\"\\n\\n\");\n" +
                    "        }\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter rows and column for first matrix: 3\n" +
                    "2\n" +
                    "Enter rows and column for second matrix: 3\n" +
                    "2\n" +
                    "Error! column of first matrix not equal to row of second.\n" +
                    "\n" +
                    "Enter rows and column for first matrix: 2\n" +
                    "3\n" +
                    "Enter rows and column for second matrix: 3\n" +
                    "2\n" +
                    "\n" +
                    "Enter elements of matrix 1:\n" +
                    "Enter elements a11: 3\n" +
                    "Enter elements a12: -2\n" +
                    "Enter elements a13: 5\n" +
                    "Enter elements a21: 3\n" +
                    "Enter elements a22: 0\n" +
                    "Enter elements a23: 4\n" +
                    "\n" +
                    "Enter elements of matrix 2:\n" +
                    "Enter elements b11: 2\n" +
                    "Enter elements b12: 3\n" +
                    "Enter elements b21: -9\n" +
                    "Enter elements b22: 0\n" +
                    "Enter elements b31: 0\n" +
                    "Enter elements b32: 4\n" +
                    "\n" +
                    "Output Matrix:\n" +
                    "24  29\n" +
                    "\n" +
                    "6  25 ");
        }
        if(value.equals("c13")) {
            title.setText("transpose of matrix");
            code.setText("#include <stdio.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int a[10][10], transpose[10][10], r, c, i, j;\n" +
                    "    printf(\"Enter rows and columns of matrix: \");\n" +
                    "    scanf(\"%d %d\", &r, &c);\n" +
                    "\n" +
                    "    // Storing elements of the matrix\n" +
                    "    printf(\"\\nEnter elements of matrix:\\n\");\n" +
                    "    for(i=0; i<r; ++i)\n" +
                    "        for(j=0; j<c; ++j)\n" +
                    "        {\n" +
                    "            printf(\"Enter element a%d%d: \",i+1, j+1);\n" +
                    "            scanf(\"%d\", &a[i][j]);\n" +
                    "        }\n" +
                    "\n" +
                    "    // Displaying the matrix a[][] */\n" +
                    "    printf(\"\\nEntered Matrix: \\n\");\n" +
                    "    for(i=0; i<r; ++i)\n" +
                    "        for(j=0; j<c; ++j)\n" +
                    "        {\n" +
                    "            printf(\"%d  \", a[i][j]);\n" +
                    "            if (j == c-1)\n" +
                    "                printf(\"\\n\\n\");\n" +
                    "        }\n" +
                    "\n" +
                    "    // Finding the transpose of matrix a\n" +
                    "    for(i=0; i<r; ++i)\n" +
                    "        for(j=0; j<c; ++j)\n" +
                    "        {\n" +
                    "            transpose[j][i] = a[i][j];\n" +
                    "        }\n" +
                    "\n" +
                    "    // Displaying the transpose of matrix a\n" +
                    "    printf(\"\\nTranspose of Matrix:\\n\");\n" +
                    "    for(i=0; i<c; ++i)\n" +
                    "        for(j=0; j<r; ++j)\n" +
                    "        {\n" +
                    "            printf(\"%d  \",transpose[i][j]);\n" +
                    "            if(j==r-1)\n" +
                    "                printf(\"\\n\\n\");\n" +
                    "        }\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}");
            output.setText("Enter rows and columns of matrix: 2\n" +
                    "3\n" +
                    "\n" +
                    "Enter element of matrix:\n" +
                    "Enter element a11: 2\n" +
                    "Enter element a12: 3\n" +
                    "Enter element a13: 4\n" +
                    "Enter element a21: 5\n" +
                    "Enter element a22: 6\n" +
                    "Enter element a23: 4\n" +
                    "\n" +
                    "Entered Matrix: \n" +
                    "2  3  4  \n" +
                    "\n" +
                    "5  6  4  \n" +
                    "\n" +
                    "\n" +
                    "Transpose of Matrix:\n" +
                    "2  5  \n" +
                    "\n" +
                    "3  6  \n" +
                    "\n" +
                    "4  4  ");
        }
    }
}
