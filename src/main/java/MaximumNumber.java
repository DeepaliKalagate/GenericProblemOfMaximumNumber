public class MaximumNumber<E extends Comparable>
{
    public E findMaximum(E... elements)
    {
        for (int i = 0; i < elements.length - 1; i++)
        {
            for (int j = 0; j < elements.length - i - 1; j++)
            {
                if (elements[j].compareTo(elements[j + 1]) > 0)
                {
                    E temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        return elements[elements.length - 1];
    }

}
